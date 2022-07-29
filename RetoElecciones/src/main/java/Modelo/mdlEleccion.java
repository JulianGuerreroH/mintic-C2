package Modelo;

import clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author TOSHIBA
 */
public class mdlEleccion {
    
    baseDatos bDatos;

    public mdlEleccion() {
        this.bDatos = new baseDatos();
    }
    //PARA CANDIDATO
    
    public boolean crearCandidato(clsCandidato candidato){
        try(Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            
            String query = "INSERT INTO tb_candidato(id_candidato, nombre, telefono, genero,"+
                    " partido_politico, ciuidad_origen, descripcion, mensaje_campania) "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            
            PreparedStatement sentencia = con.prepareStatement(query); // para reutulizar el ID generado
            
            sentencia.setString(1, candidato.getIdDocumento());
            sentencia.setString(2, candidato.getNombre());
            sentencia.setString(3, candidato.getTelefono());
            sentencia.setString(4, candidato.getGenero());
            sentencia.setString(5, candidato.getPartidoPolitico());
            sentencia.setString(6, candidato.getCiudadOrigen());
            sentencia.setString(7, candidato.getDescripcion());
            sentencia.setString(8, candidato.getMjsCampaña());
            
            int filasIncertadas = sentencia.executeUpdate();//Conocer si fue incertado el registro
            if (filasIncertadas > 0){
                query = "INSERT INTO tb_propuestas (propuesta, id_candidato) VALUES (?,?)";
                PreparedStatement sentenciaPropuesta = con.prepareStatement(query);
                
                sentenciaPropuesta.setString(1, candidato.getPropuesta());
                sentenciaPropuesta.setString(2, candidato.getIdDocumento());
                
                
                filasIncertadas = sentenciaPropuesta.executeUpdate();
                return filasIncertadas > 0;
            } 
            return false;
        }catch(SQLException e){
            return false;
        }
    }

    public clsCandidato buscarCandidato(String id){
        
        clsCandidato candidato = null;
        try(Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            
            String query = "SELECT c.id_candidato,c.nombre,c.telefono,c.genero,c.partido_politico,c.ciuidad_origen,c.descripcion,c.mensaje_campania,p.propuesta FROM tb_candidato as c INNER JOIN tb_propuestas as p ON c.id_candidato=p.id_candidato WHERE c.id_candidato = ?";
            PreparedStatement sentencia = con.prepareStatement(query);
            sentencia.setString(1, id);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){
                String idCandidato = resultado.getString(1);
                String nombre = resultado.getString(2);
                String telefono = resultado.getString(3);
                String genero = resultado.getString(4);
                String partidoPol = resultado.getString(5);
                String ciudad = resultado.getString(6);
                String descripcion = resultado.getString(7);
                String mjsCampania = resultado.getString(8);
                String propuesta = resultado.getString(9);
                
                candidato = new clsCandidato(partidoPol, ciudad, descripcion, mjsCampania, propuesta, idCandidato, nombre, 
                        telefono, genero);
            }
            return candidato;
            
        } catch (Exception e) {
            return candidato;
        }
    }
    
    public boolean modificarCandidato(clsCandidato candidato){
        try(Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            
            String query = "UPDATE tb_candidato SET nombre = ?, telefono = ?, genero = ?, partido_politico = ?,"+
                    "ciuidad_origen = ?, descripcion = ?, mensaje_campania = ? WHERE id_candidato = ?";
            
            PreparedStatement sentencia = con.prepareStatement(query); // para reutulizar el ID generado
            
            sentencia.setString(1, candidato.getNombre());
            sentencia.setString(2, candidato.getTelefono());
            sentencia.setString(3, candidato.getGenero());
            sentencia.setString(4, candidato.getPartidoPolitico());
            sentencia.setString(5, candidato.getCiudadOrigen());
            sentencia.setString(6, candidato.getDescripcion());
            sentencia.setString(7, candidato.getMjsCampaña());
            sentencia.setString(8, candidato.getIdDocumento());
            

            String queryP = "UPDATE tb_propuestas SET propuesta = ? WHERE id_candidato = ?";
            PreparedStatement sentenciaPropuesta = con.prepareStatement(queryP);

            sentenciaPropuesta.setString(1, candidato.getPropuesta());
            sentenciaPropuesta.setString(2, candidato.getIdDocumento());

            int filasActualizadas = sentencia.executeUpdate();
            int filasActualizadasP = sentenciaPropuesta.executeUpdate();
            return filasActualizadas > 0 && filasActualizadasP > 0;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean eliminarCandidato(String id){
        try(Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            String queryP = "DELETE FROM tb_propuestas WHERE id_candidato = ?";
            PreparedStatement sentenciaP = con.prepareStatement(queryP);
            sentenciaP.setString(1, id);
            
            String query = "DELETE FROM `tb_candidato` WHERE id_candidato = ?";
            PreparedStatement sentencia = con.prepareStatement(query);
            sentencia.setString(1, id);
            
            int registroEliminadoP = sentenciaP.executeUpdate();
            int registroEliminado = sentencia.executeUpdate();
            return registroEliminado > 0 && registroEliminadoP > 0;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public LinkedList<clsCandidato> listaCandidato(){
        
        LinkedList<clsCandidato> listaCandidato = new LinkedList<>();
        try(Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            
            String query = "SELECT c.id_candidato,c.nombre,c.telefono,c.genero,c.partido_politico,c.ciuidad_origen,c.descripcion,c.mensaje_campania,p.propuesta FROM tb_candidato as c INNER JOIN tb_propuestas as p ON c.id_candidato=p.id_candidato";
            PreparedStatement sentencia = con.prepareStatement(query);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){
                String idCandidato = resultado.getString(1);
                String nombre = resultado.getString(2);
                String telefono = resultado.getString(3);
                String genero = resultado.getString(4);
                String partidoPol = resultado.getString(5);
                String ciudad = resultado.getString(6);
                String descripcion = resultado.getString(7);
                String mjsCampania = resultado.getString(8);
                String propuesta = resultado.getString(9);
                
                clsCandidato candidato = new clsCandidato(partidoPol, ciudad, descripcion, mjsCampania, propuesta, idCandidato, nombre, 
                        telefono, genero);
                listaCandidato.add(candidato);
                
            }
            return listaCandidato;
            
        } catch (Exception e) {
            return listaCandidato;
        }
    }
    
    
    //PARA VOTANTE
    
    public boolean crearVotante(clsVotante votante){
        try (Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            
            String query = "INSERT INTO tb_votante (id_votante,nombre,telefono,genero,edad,correo,ciudad_votacion)"+
                    "VALUES (?,?,?,?,?,?,?)";
            
            PreparedStatement sentencia = con.prepareStatement(query);
            
            sentencia.setString(1, votante.getIdDocumento());
            sentencia.setString(2, votante.getNombre());
            sentencia.setString(3, votante.getTelefono());
            sentencia.setString(4, votante.getGenero());
            sentencia.setString(5, votante.getEdad());
            sentencia.setString(6, votante.getCorreo());
            sentencia.setString(7, votante.getCiuadVotacion());
            
            int filasIncertadas = sentencia.executeUpdate();
            return filasIncertadas > 0; 
            
        } catch (SQLException e) {
            return false;
        }
    }   
    
    public clsVotante buscarVotante(String id){
        
        clsVotante votante = null;
        try(Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            
            String query = "SELECT * FROM tb_votante WHERE id_votante = ?";
            PreparedStatement sentencia = con.prepareStatement(query);
            sentencia.setString(1, id);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){
                String idVotante = resultado.getString(1);
                String nombre = resultado.getString(2);
                String telefono = resultado.getString(3);
                String genero = resultado.getString(4);
                String edad = resultado.getString(5);
                String correo = resultado.getString(6);
                String ciudad = resultado.getString(7);
                
                votante = new clsVotante(correo, edad, ciudad, idVotante, nombre, telefono, genero);
            }
            return votante;
            
        } catch (Exception e) {
            return votante;
        }
    }
    
    public boolean modificarVotante(clsVotante votante){
        try(Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            
            String query = "UPDATE tb_votante SET nombre = ?, telefono = ?, genero = ?, edad = ?,"+
                    "correo = ?, ciudad_votacion = ? WHERE id_votante = ?";
            
            PreparedStatement sentencia = con.prepareStatement(query); // para reutulizar el ID generado
            
            sentencia.setString(1, votante.getNombre());
            sentencia.setString(2, votante.getTelefono());
            sentencia.setString(3, votante.getGenero());
            sentencia.setString(4, votante.getEdad());
            sentencia.setString(5, votante.getCorreo());
            sentencia.setString(6, votante.getCiuadVotacion());
            sentencia.setString(7, votante.getIdDocumento());

            int filasActualizadas = sentencia.executeUpdate();
            return filasActualizadas > 0;
        }catch(SQLException e){
            return false;
        }
    }
    
        public boolean eliminarVotante(String id){
        try(Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            String query = "DELETE FROM tb_votante WHERE id_votante = ?";
            PreparedStatement sentencia = con.prepareStatement(query);
            sentencia.setString(1, id);
                        
            int registroEliminado = sentencia.executeUpdate();
            return registroEliminado > 0;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public LinkedList<clsVotante> listaVotante(){
        
        LinkedList<clsVotante> listaVotante = new LinkedList<>();
        try(Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            
            String query = "SELECT * FROM tb_votante";
            PreparedStatement sentencia = con.prepareStatement(query);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){
                String idVotante = resultado.getString(1);
                String nombre = resultado.getString(2);
                String telefono = resultado.getString(3);
                String genero = resultado.getString(4);
                String edad = resultado.getString(5);
                String correo = resultado.getString(7);
                String ciudad = resultado.getString(6);
                
                clsVotante votante = new clsVotante(correo, edad, ciudad, idVotante, nombre, telefono, genero);
                
                listaVotante.add(votante);
            }
            return listaVotante;
            
        } catch (Exception e) {
            return listaVotante;
        }
    }    
    
    
    //PARA ADMINISTRADOR
    public boolean crearEleccion(clsEleccion eleccion){
        try (Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            
            String query = "INSERT INTO tb_eleccion (id_eleccion,descripcion,anio,fecha_inicio,fecha_fin) VALUES (?,?,?,?,?)";
            
            PreparedStatement sentencia = con.prepareStatement(query);
            
            sentencia.setString(1, eleccion.getIdEleccion());
            sentencia.setString(2, eleccion.getDescripcion());
            sentencia.setString(3, eleccion.getYear());
            sentencia.setString(4, eleccion.getFechaInicio());
            sentencia.setString(5, eleccion.getFechaFin());
            
            int filasIncertadas = sentencia.executeUpdate();
            return filasIncertadas > 0; 
            
        } catch (SQLException e) {
            return false;
        }
    }
    
    
    //VOTACIONES
    /*
    public LinkedList<clsVotante> listaVotante(){
        
        LinkedList<clsVotante> listaVotante = new LinkedList<>();
        try(Connection con = DriverManager.getConnection(bDatos.getUrl(),bDatos.getUsuario(),bDatos.getContrasenia())) {
            
            String query = "SELECT * FROM tb_votante";
            PreparedStatement sentencia = con.prepareStatement(query);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){
                String idVotante = resultado.getString(1);
                String nombre = resultado.getString(2);
                String telefono = resultado.getString(3);
                String genero = resultado.getString(4);
                String edad = resultado.getString(5);
                String correo = resultado.getString(7);
                String ciudad = resultado.getString(6);
                
                clsVotante votante = new clsVotante(correo, edad, ciudad, idVotante, nombre, telefono, genero);
                
                listaVotante.add(votante);
            }
            return listaVotante;
            
        } catch (Exception e) {
            return listaVotante;
        }
    } */
    
}

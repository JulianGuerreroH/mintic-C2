
package Modelo;

import clases.*;
//import clases.clsJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*import java.sql.DriverManager;
import clases.clsCandidato;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
*/

public class mdlCandidato {

/*
    clsJdbc jdbc;
    public mdlCandidato() {
        this.jdbc = new clsJdbc();
        jdbc.CrearConexion();
    }
    
    public boolean crearCandidato(clsCandidato candidato){
        
        try{
            String query = "INSERT INTO tb_candidato VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(query);
            
            sentencia.setString(1, candidato.getIdDocumento());
            sentencia.setString(2, candidato.getNombre());
            sentencia.setString(3, candidato.getTelefono());
            sentencia.setString(4, candidato.getGenero());
            sentencia.setString(5, candidato.getPartidoPolitico());
            sentencia.setString(6, candidato.getCiudadOrigen());
            sentencia.setString(7, candidato.getDescripcion());
            sentencia.setString(8, candidato.getMjsCampaña());
            
            int filasIncertadas = sentencia.executeUpdate();//Conocer si fue incertado el registro
            return filasIncertadas > 0; 


        }catch(SQLException e){
            return false;
        }
    }
}
*/      
    
    
    
    

    baseDatos bDatos;
    
    public mdlCandidato(){//Crea el constructor para que al momento de llamar la funcion cree una nueva conexion
        this.bDatos = new baseDatos(); //puente con el modelo 
    }

    
    public boolean CrearCandidato(clsCandidato candidato){// importante colocar el objeto tipo candidato, para traer la info con el get o set
        try (Connection con = DriverManager.getConnection(bDatos.getUrl(), bDatos.getUsuario(), bDatos.getContrasenia())){
            /*paso para realizar la conexcion entre las llaves, para evitar abrir muchas conexiones
            en el proceso.*/


            String query = "INSERT INTO tb_candidato(id_candidato, nombre, telefono, genero,"+
                    " partido_politico, ciuidad_origen, descripcion, mensaje_campaña) "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = con.prepareStatement(query);
            
            sentencia.setString(1, candidato.getIdDocumento());
            sentencia.setString(2, candidato.getNombre());
            sentencia.setString(3, candidato.getTelefono());
            sentencia.setString(4, candidato.getGenero());
            sentencia.setString(5, candidato.getPartidoPolitico());
            sentencia.setString(6, candidato.getCiudadOrigen());
            sentencia.setString(7, candidato.getDescripcion());
            sentencia.setString(8, candidato.getMjsCampaña());
            
            int filasIncertadas = sentencia.executeUpdate();//Conocer si fue incertado el registro
            return filasIncertadas > 0; 


        }catch(SQLException e){
            return false;
        }
    }
}
        
        

 

    

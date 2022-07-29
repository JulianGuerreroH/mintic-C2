package Controlador;

import Modelo.mdlEleccion;
import clases.*;
import java.util.LinkedList;

/**
 *
 * @author TOSHIBA
 */
public class ctlEleccion {

    mdlEleccion mdlEleccion;

    public ctlEleccion() {
        this.mdlEleccion = new mdlEleccion();
    }

    //PARA CANDIDATO
    public boolean crearCandidato(clsCandidato candidato) {
        this.mdlEleccion.crearCandidato(candidato);
        return true;
    }

    public clsCandidato buscarCandidato(String id) {
        clsCandidato candidato = null;
        candidato = this.mdlEleccion.buscarCandidato(id);
        return candidato;
    }

    public boolean modificarCandidato(clsCandidato candidato) {
        this.mdlEleccion.modificarCandidato(candidato);
        return true;
    }

    public boolean eliminarCandidato(String id) {
        this.mdlEleccion.eliminarCandidato(id);
        return true;
    }

    public LinkedList<clsCandidato> listaCandidato() {
        LinkedList<clsCandidato> candidato = null;
        candidato = this.mdlEleccion.listaCandidato();
        return candidato;
    }

    //PARA VOTANTE
    public boolean crearVotante(clsVotante votante) {
        this.mdlEleccion.crearVotante(votante);
        return true;
    }

    public clsVotante buscarVotante(String id) {
        clsVotante votante = null;
        votante = this.mdlEleccion.buscarVotante(id);
        return votante;
    }

    public boolean modificarVotante(clsVotante votante) {
        this.mdlEleccion.modificarVotante(votante);
        return true;
    }

    public boolean eliminarVotante(String id) {
        this.mdlEleccion.eliminarVotante(id);
        return true;
    }

    public LinkedList<clsVotante> listaVotante() {
        LinkedList<clsVotante> votante = null;
        votante = this.mdlEleccion.listaVotante();
        return votante;
    }

    //PARA ADMINISTRADOR
    public boolean crearEleccion(clsEleccion eleccion) {
        this.mdlEleccion.crearEleccion(eleccion);
        return true;
    }

}

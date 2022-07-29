package Controlador;

import Modelo.*;
import clases.clsCandidato;

/**
 *
 * @author TOSHIBA
 */
public class ctlCandidato {

    
/*  
    mdlCandidato mdlCandidato;
    public ctlCandidato() {
        this.mdlCandidato = new mdlCandidato();
    }    
    
    public boolean crearCandidato(clsCandidato candidato){
        this.mdlCandidato.crearCandidato(candidato);
        return true;
    }
*/   
    mdlCandidato mdlCandidato;
    public ctlCandidato() { // constructor
        this.mdlCandidato = new mdlCandidato();
    }
    
    public boolean crearCandidato(clsCandidato candidato){
        this.mdlCandidato.CrearCandidato(candidato);
        return true;
    }



    
    
}

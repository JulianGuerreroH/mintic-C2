package clases;

import java.util.Date;

/**
 * @author TOSHIBA
 */
public class clsEleccion {

    private String year;
    private String fechaInicio;
    private String fechaFin;
    private String ganador;
    private String descripcion;
    private String idEleccion;

    public clsEleccion(String year, String fechaInicio, String fechaFin, String descripcion, String idEleccion) {
        this.year = year;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ganador = ganador;
        this.descripcion = descripcion;
        this.idEleccion = idEleccion;
    }

    

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdEleccion() {
        return idEleccion;
    }

    public void setIdEleccion(String idEleccion) {
        this.idEleccion = idEleccion;
    }

    
    

}

package clases;

/**
 *
 * @author TOSHIBA
 */
public class clsPersona {

    private String idDocumento;
    private String nombre;
    private String telefono;
    private clsEleccion eleccion;//Agregacion, se declara pero no va dentro del constructor
    private String genero;

    public clsPersona(String idDocumento, String nombre, String telefono, String genero) {
        this.idDocumento = idDocumento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.genero = genero;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public clsEleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(clsEleccion eleccion) {
        this.eleccion = eleccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    

    
    
    
}

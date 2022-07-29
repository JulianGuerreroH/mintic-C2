package clases;


public class clsVotante extends clsPersona{
    
    private String correo;
    private String edad;
    private String CiuadVotacion;

    public clsVotante(String correo, String edad, String CiuadVotacion, String idDocumento, String nombre,
            String telefono, String genero) {
        super(idDocumento, nombre, telefono, genero);
        this.correo = correo;
        this.edad = edad;
        this.CiuadVotacion = CiuadVotacion;
    }

    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCiuadVotacion() {
        return CiuadVotacion;
    }

    public void setCiuadVotacion(String CiuadVotacion) {
        this.CiuadVotacion = CiuadVotacion;
    }

    
    


    
}

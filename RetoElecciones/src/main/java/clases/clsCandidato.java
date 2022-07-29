package clases;

public class clsCandidato extends clsPersona{
    
    private String partidoPolitico;
    private String ciudadOrigen;
    private String descripcion;
    private String mjsCampaña;
    private String propuesta;

    public clsCandidato(String partidoPolitico, String ciudadOrigen, String descripcion, String mjsCampaña, 
            String propuesta, String idDocumento, String nombre, String telefono, String genero) {
        super(idDocumento, nombre, telefono, genero);
        this.partidoPolitico = partidoPolitico;
        this.ciudadOrigen = ciudadOrigen;
        this.descripcion = descripcion;
        this.mjsCampaña = mjsCampaña;
        this.propuesta = propuesta;
    }


    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMjsCampaña() {
        return mjsCampaña;
    }

    public void setMjsCampaña(String mjsCampaña) {
        this.mjsCampaña = mjsCampaña;
    }

    public String getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(String propuesta) {
        this.propuesta = propuesta;
    }

    
    
}

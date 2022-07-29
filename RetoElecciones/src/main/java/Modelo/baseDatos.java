
package Modelo;

/**
 * @author TOSHIBA
 */
public class baseDatos {
    //final, ya que no se van a poder modificar
    private final String driver = "com.mysql.jdbc.Driver";
    private final String usuario = "root";
    private final String contrasenia = "";
    private final String url = "jdbc:mysql://localhost:3306/bd_elecciones";

    
    //Dejamos unicamente get para acceder a ellos, no modificarlos
    public String getDriver() {
        return driver;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getUrl() {
        return url;
    }
    
    
}

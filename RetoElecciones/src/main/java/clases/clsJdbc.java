
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * @author TOSHIBA
 */

public class clsJdbc{

    String driver = "com.mysql.jdbc.Driver";
    String usuario = "root";
    String contraseña = "";
    String url = "jdbc:mysql://localhost:3306/bd_elecciones";
    
    public Connection conexion;

    public void CrearConexion(){
    try{
        Class.forName(driver);
        conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
        if(conexion != null){
            System.out.println("Conexion exitosa");
        }
    }catch(Exception e){
            System.out.println("Error en la conexión" + e.getMessage());
    }

    }
}


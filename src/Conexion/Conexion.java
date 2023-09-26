
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Vito
 */
public class Conexion {
    
public static final String URL = "jdbc:mysql://192.168.100.117/tienda?autoReconnet=true&useSSL=false";
public static final String USU = "lucaprodan";
public static final String PAS = "";


public Connection getConnection(){
    
    Connection conexion = null;
    
    try {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = (Connection) DriverManager.getConnection(URL,USU,PAS);
        
    } catch ( ClassNotFoundException | SQLException e) {
        System.err.println("Error en la conexion "+e);
    }
    
    return conexion;
}
}

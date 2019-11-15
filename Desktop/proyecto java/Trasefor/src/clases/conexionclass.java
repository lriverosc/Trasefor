
package clases;


import java.sql.Connection;
import java.sql.DriverManager;

public class conexionclass {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/Trasefor_fisico","root","Adminroot765");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
    
}

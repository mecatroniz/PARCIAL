
package Config;


import java.sql.*;


public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro1","root","");
            
            System.out.print("conexion establecidad");
        } catch (Exception e) {
            System.out.print("conexion no establecidad"+e);
        }
    }
    
    public Connection getConnection(){
        return con;
    
    }
    
}

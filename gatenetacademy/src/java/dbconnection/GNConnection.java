
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GNConnection 
{
    private static final String url="jdbc:mysql://localhost:3306/gatenetacademy";
    private static final String user="root";
    private static final String password="root";
    
    public static Connection getGNConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection(url,user,password);
         return con;
        
    }
}

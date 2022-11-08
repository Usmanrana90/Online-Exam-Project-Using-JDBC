
package gnaction;

import dbconnection.GNConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class LoginAction 
{
    public boolean checkUserMobile(long mobile, String pwd) throws SQLException, ClassNotFoundException
    {
       Connection con=GNConnection.getGNConnection();
       Statement st=con.createStatement();
       ResultSet rs= st.executeQuery("select * from register where mobile='"+mobile+"' and password='"+pwd+"'");
       if(rs.next())
       {
           return true;
       }
       else
       {
           return false;
       }
    }
     public boolean checkUserEmail(String Email, String pwd, String email) throws SQLException, ClassNotFoundException
    {
       Connection con=GNConnection.getGNConnection();
       Statement st=con.createStatement();
     ResultSet rs= st.executeQuery("select * from register where email='"+email+"' and password='"+pwd+"'");
       if(rs.next())
       {
           return true;
       }
       else
       {
           return false;
       }
    }

    public boolean checkUserEmail(String user, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
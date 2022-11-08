/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gnaction;

import dbconnection.GNConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class AdminAction
{
    public static ResultSet getUserData() throws Exception
    {
        
            Connection con=GNConnection.getGNConnection();
            Statement s=con.createStatement();
        
            ResultSet rs=s.executeQuery("select * from register");
        
    return rs;
    }
    
    
    public boolean deleteUser(long mobile) throws Exception
    {
         Connection con=GNConnection.getGNConnection();
         
            PreparedStatement ps=con.prepareStatement("delete from register where mobile=?");
                
            
            ps.setLong(1, mobile);
            
             int i= ps.executeUpdate();
             
            if(i>0)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    
}

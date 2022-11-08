
package gnaction;
import java.sql.ResultSet;
import dbconnection.GNConnection;
import gnbean.RegBean;
import java.sql.Connection;
import java.sql.Statement;

public class RegAction
{
    public int insertRegRecord(RegBean data)
    {
        int i=0;
        try
        {
Connection con=GNConnection.getGNConnection();
Statement s=con.createStatement();
i=s.executeUpdate("insert into register values ('"+data.getName()+"','"+data.getEmail()+"','"+data.getMobile()+"','"+data.getDob()+"','"+data.getPassword()+"')");
           
         
        }
        catch(Exception e)
        {
            
        }
         return i;
    }
    public ResultSet updateUser(String email) throws Exception
            
            
            
    {
        Connection con=GNConnection.getGNConnection();
        Statement s=con.createStatement();
        ResultSet rs= s.executeQuery("select * from register where email='"+email+"'");
        return rs;
    }
    public int updateRegRecord(RegBean data) throws Exception
    {
        Connection con=GNConnection.getGNConnection();
        Statement s=con.createStatement();
int i= s.executeUpdate("update register set name='"+data.getName()+"', mobile'"+data.getMobile()+"',dob='"+data.getDob()+"', password'"+data.getPassword()+"', where email='"+data.getEmail()+"'");
     return i;
        }
}

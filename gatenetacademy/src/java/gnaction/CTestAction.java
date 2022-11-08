/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gnaction;

import dbconnection.GNConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class CTestAction
{
    public ResultSet getCTest()throws Exception
    {
         Connection con=GNConnection.getGNConnection();
         Statement st=con.createStatement();
         ResultSet rs= st.executeQuery("select qno,question,option1,option2,option3,option4, from ctest");
         return rs;
    }
    public ResultSet getCTestAns()throws Exception
    {
         Connection con=GNConnection.getGNConnection();
         Statement st=con.createStatement();
         ResultSet rs= st.executeQuery("select ans from ctest");
         return rs;
    }
            
}

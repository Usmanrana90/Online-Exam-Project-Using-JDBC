/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gnservlet;

import gnaction.CTestAction;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CTestServlet extends HttpServlet {
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       try {
        String [] userans={null, null, null, null};
        int j=1;
        for(int i=0; i<=4;i++)
        {
            userans[i]=request.getParameter(j+"");
            j++;
        }
        CTestAction ac=new CTestAction();
        
            ResultSet rs=ac.getCTestAns();
        
       String realans[]=new String[5];
       int k=0;
       while(rs.next())
       {
           realans[k]=rs.getString(1);
           k++;
       }
       int result=0;
       for(int a=0;a<5;a++)
       {
           if(userans[a]!=null)
            {
               
             if(userans[a].equals(realans[a]))
           {
               result++;
           }
       }
       }
      
       response.sendRedirect("result.jsp?result="+result);
       
       } 
        catch (Exception ex) {
            Logger.getLogger(CTestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }

    


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gnservlet;

import gnaction.AdminAction;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteRegServlet extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
         String mobile=request.getParameter("mobile");
            long mob=Long.parseLong(mobile);
            
            AdminAction ac=new AdminAction();
        try {
           
            boolean b=ac.deleteUser(mob);
            if(b==true)
            {
                response.sendRedirect("Admin.jsp");
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(DeleteRegServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}


package gnservlet;

import gnaction.LoginAction;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       String user=request.getParameter("user"); 
       String password=request.getParameter("pwd");
       
       
       int i=-1;
       
       i=user.indexOf('@');
       LoginAction ac=new LoginAction();
       if(i>0)//email
       {
           try{
          boolean b= ac.checkUserEmail(user, password);
          if(b==true)
          {
              HttpSession sess=request.getSession();
              sess.setAttribute("Email",user);

              response.sendRedirect("user.jsp");
          }
          else
          {
              response.sendRedirect("login.jsp");
          }
          }
           catch(Exception e)
           {
               
           }
           }
       else//mobile
       {
           long mob=Long.parseLong(user);
           try{
          boolean b= ac.checkUserMobile(mob, password);
          if(b==true)
          {
              HttpSession sess=request.getSession();
              sess.setAttribute("mobile",user);
              response.sendRedirect("user.jsp");
          }
          else
          {
              response.sendRedirect("login.jsp");
          }
          }
           catch(Exception e)
           {
               
           }
       }
    }
}


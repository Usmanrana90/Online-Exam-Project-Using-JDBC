
package gnservlet;

import gnaction.RegAction;
import gnbean.RegBean;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegServlet extends HttpServlet 
{
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try
        {
       String name= request.getParameter("name");
       String email= request.getParameter("email");
       String mobile= request.getParameter("mobile");
       String dob= request.getParameter("dob");
       String password= request.getParameter("password");
       long mob=Long.parseLong(mobile);
       
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
       java.util.Date udob=sdf.parse(dob);
        
       long l=udob.getTime();
       java.sql.Date sdob=new java.sql.Date(l);
       
       RegBean data=new RegBean();
               data.setName(name);
               data.setEmail(email);
               data.setMobile(mob);
               data.setDob(sdob);
               data.setPassword(password);
               
               RegAction ac=new RegAction();
               int i=ac.insertRegRecord(data);
               
               if(i>0)
               {
                   
                   response.sendRedirect("success.jsp");
               }
               else
               {
                   response.sendRedirect("error.jsp");
               }
               
               
    }
        catch(Exception e)
        {

        }

    }
}


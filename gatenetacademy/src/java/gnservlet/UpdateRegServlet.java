
package gnservlet;
import gnaction.RegAction;
import gnbean.RegBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;

public class UpdateRegServlet extends HttpServlet {
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String mob=request.getParameter("mobile");
        String dob=request.getParameter("dob");
        String pwd=request.getParameter("password");
    
        long mobile=Long.parseLong(mob);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
        try
        {
        java.util.Date udob=sdf.parse(dob);
        long l=udob.getTime();
        java.sql.Date sdob=new java.sql.Date(l);
        
            RegBean data=new RegBean();
            data.setName(name);
            data.setEmail(email);
            data.setMobile(mobile);
            data.setDob(sdob);
            data.setPassword(pwd);

    RegAction ac=new RegAction();
    int i=ac.updateRegRecord(data);
    if(i>0)
    {
        response.sendRedirect("Admin.jsp");
        
        
    }

        }
        catch(Exception e)
        {
            
        }
    }

    
}

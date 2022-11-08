<%-- 
    Document   : admin1
    Created on : 7 May, 2020, 3:33:12 AM
    Author     : usmanranaofficial
--%>

<%@page import="gnaction.RegAction"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="gnaction.AdminAction"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr><th>NAME</th><th>EMAIL</th><th>MOBILE</th><th>DOB</th><th>PASSWORD</th><th>DELETE USER</th><th>EDIT</th></tr>
        <%
        AdminAction ac=new AdminAction();
        
        ResultSet rs=ac.getUserData();
        
       while(rs.next())
       {
          %>
            <tr><td><%=rs.getString(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getLong(3)%></td><td><%=rs.getDate(4)%></td><td><%=rs.getString(5)%></td><td><a href="DeleteRegServlet?mobile=<%=rs.getLong(3)%>"<oneclick=" return confirm('Are You Sure Want to Delete')"><img style="width: 40px; height:40px;" src="img/dlt.jpg"></a></td><td><a href="Admin.jsp?email=<%=rs.getString(2)%>">[EDIT]</a></td></tr>
                                                                                                                                                                                         
            
            
            
            <%
       }
        
        
        
        
        
        %>
        </table>
        
        <%
        String email=request.getParameter("email");
        RegAction al=new RegAction();
        
        
        if(email!=null)
        {
        ResultSet rsl= al.updateUser(email);
        rsl.next();
        
        %>
        <form method="post" action="UpdateRegServlet">
            <input type="text" name="name" value="<%=rsl.getString(1)%>">
            <input type="text" name="email" value="<%=rsl.getString(2)%>" readonly="">
            <input type="text" name="mobile" value="<%=rsl.getLong(3)%>">
            <input type="date" name="dob" value="<%=rsl.getDate(4)%>">
            <input type="text" name="password" value="<%=rsl.getString(5)%>">
            <input type="submit" name="name" value="update">
           
        </form>
        <%
        
            }
        
        %>
    </body>
</html>

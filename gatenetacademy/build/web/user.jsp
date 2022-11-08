<%-- 
    Document   : user
    Created on : 8 Mar, 2020, 12:27:07 PM
    Author     : usman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String user="";
        HttpSession sess=request.getSession();
        if(sess!=null)
        {
           user=sess.getAttribute("Email").toString();
        
        }
        
        
        
        
        %>
        
        <h1>Welcome <%=user%></h1>
        <h1><a href="">Logout</a></h1>
    </body>
</html>

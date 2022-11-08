<%-- 
    Document   : logout
    Created on : 7 May, 2020, 2:42:34 AM
    Author     : usmanranaofficial
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
        session.removeAttribute("Email");
        response.sendRedirect("login.jsp");
        %>
    </body>
</html>

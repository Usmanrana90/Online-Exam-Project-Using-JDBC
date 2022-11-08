<%-- 
    Document   : result
    Created on : 10 May, 2020, 2:15:40 AM
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
        
        String result=request.getParameter("result");
        
        
        
        %>
        <h1>YOUR SCORE IS: <%=result %> </h1>
    </body>
</html>

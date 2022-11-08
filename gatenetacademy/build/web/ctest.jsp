<%-- 
    Document   : ctest
    Created on : 9 May, 2020, 5:36:28 AM
    Author     : usmanranaofficial
--%>
<%@page  import="java.sql.ResultSet"%>
<%@page import="gnaction.CTestAction"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="CTestServlet" method="post">  
            <table border="1">
            
            <%
        CTestAction ac= new CTestAction();
        ResultSet rs=ac.getCTest();
        
        
        while(rs.next())
        {
            
      
        %>
        <tr>
         <td>A.</td><td><input type="radio" name="<%=rs.getString(1)%>" value="<%=rs.getString(3) %>"><%=rs.getString(3)%></td>
         <td>B.</td><td><input type="radio" name="<%=rs.getString(1)%>" value="<%=rs.getString(4) %>"><%=rs.getString(4)%></td>
         <td>C.</td><td><input type="radio" name="<%=rs.getString(1)%>" value="<%=rs.getString(5) %>"><%=rs.getString(5)%></td>
         <td>D.</td><td><input type="radio" name="<%=rs.getString(1)%>" value="<%=rs.getString(6) %>"><%=rs.getString(6)%></td>
         </tr>
         
        <tr>
        <td><%=rs.getString(3)%></td>
        </tr>
        
        <%
        
        }
        
        %>
        <tr>
            <td> <input type="submit"></td>
        </tr>
            </table>
        </form>

    </body>
</html>

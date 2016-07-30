<%-- 
    Document   : DeclarationTest
    Created on : Sep 14, 2015, 3:05:37 AM
    Author     : waxxan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>
        <table style = "border: 2px solid blue;">
         <tr><td>NUMBER</td><td>VALUE</td></tr>
            <% for( int j = 1; j<= 10; j++){%>
            
                
            <tr><td>count =</td> <td><%= j%></td></tr>
                
            
            <%}%>
            </table>
        </h1>
        
    </body>
</html>

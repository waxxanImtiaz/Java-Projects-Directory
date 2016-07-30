<%-- 
    Document   : DispatcherJSP2
    Created on : Jan 27, 2016, 3:42:45 PM
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
        <h1>This is Jsp page 2</h1>
        <% String name = request.getParameter("name");
           String email = request.getParameter("email");
           
        %>
        <%= "<h1>Your name is "+name+"<h1>" %>
        
        <%= "<h1>Your email is "+email+"<h1>" %>
        <% response.sendRedirect("https://www.google.com");  %>     
    </body>
</html>

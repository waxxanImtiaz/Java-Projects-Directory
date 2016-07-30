<%-- 
    Document   : Hello
    Created on : Sep 12, 2015, 2:06:10 PM
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
        <% out.println(new java.util.Date()); %><br />
        Date:<%=new java.util.Date()%>
    </body>
</html>

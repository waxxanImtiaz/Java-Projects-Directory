<%-- 
    Document   : DispatcheJSP1
    Created on : Jan 27, 2016, 3:42:30 PM
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
        <h1>Page one</h1>
        <%
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        %>
        
        <%
         if( name.equals("imtiaz")&&email.equals("waxxan.imtiaz.123@gmail.com") )
         {
        request.getRequestDispatcher("DispatcherJSP2.jsp").forward(request, response);
        }else{
           out.println("<h1>Name or email are not valid</h1>"); 
        }%>
        <%= "<h1>After forward method</h1>" %>
    </body>
</html>

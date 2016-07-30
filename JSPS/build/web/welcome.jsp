
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>welcome.jsp</h1>
        <%
        String name = (String)session.getAttribute("name");
        
        out.println(name);
        %>
    </body>
</html>

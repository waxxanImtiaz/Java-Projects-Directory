<%-- 
    Document   : process
    Created on : Oct 17, 2015, 5:21:49 AM
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
        <%@taglib uri="http://localhost/profile.html"  prefix = "d"%>
        First Name:<d:out value="${param.name}"></d:out><br />
        AGE: <d:out value="${param.age}"></d:out>
        ID:  <d:out value="${param.id}"></d:out>
    
    
    </body>
</html>

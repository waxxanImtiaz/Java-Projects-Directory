<%-- 
    Document   : TestJspPage
    Created on : Jan 27, 2016, 3:01:56 PM
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
        <h1>Hello World! This is a JSP page</h1>
        <%= java.util.Calendar.getInstance().getTime()  %>
         <%= "cube of 12 is "+cube(12) %>
        <%!
        
        public int cube( int n ){
       
            return n*n*n;
        }
        %>
    </body>
</html>

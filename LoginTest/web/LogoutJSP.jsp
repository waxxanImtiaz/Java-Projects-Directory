
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<!--        <meta http-equiv="Pragma" content="no-cache"> 
        <meta http-equiv="Cache-Control"      content="no-cache"> 
        <meta http-equiv="Expires" content="Sat, 01 Dec 2012 00:00:00 GMT">-->
        <title>JSP Page</title>ent-Type" content="text/html; charset=UTF-8">
        <title>JSP
    </head>
    <body>
        <h1>Hello World!</h1>
       <%
                  RequestDispatcher rd = null;  
                  session = request.getSession( false );
                  response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
                  response.setHeader("Cache-Control","no-store");
                  response.setHeader("Pragma","no-cache"); //HTTP 1.0 
                  response.setDateHeader ("Expires", 0);
                  if( session != null){
                        session.invalidate();
                        rd = request.getRequestDispatcher("login.html");
            
                  }
                      rd.forward(request, response);
                  
          %>
    </body>
</html>

<%-- 
    Document   : Logout
    Created on : Oct 24, 2015, 2:32:11 PM
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
      <%
      
        
        session.removeAttribute("username");
        session.removeAttribute("pInfo");
        session.removeAttribute("edu");
        session.removeAttribute("otherInfo");
        session.removeAttribute("sessionId");  
        session.invalidate();
//        RequestDispatcher rd=request.getRequestDispatcher("StartPage.jsp");  
//        out.println("<h1>Please login first</h1>");
       
           response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
           response.setHeader("Cache-Control","no-store");
           response.setHeader("Pragma","no-cache"); //HTTP 1.0 
           response.setDateHeader ("Expires", 0);
           response.sendRedirect("StartPage.jsp");
      %>
    </body>
</html>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String id;
        id = session.getId();
        if(username.equals("imtiaz")&&(password.equals("wassan")))
        {
            session.setAttribute("username", username);
            session.setAttribute("sessionId", id);
            response.sendRedirect("Profile");
        }
        else
        {
            response.sendRedirect("Error.jsp");
        }
        %>
    </body>
</html>

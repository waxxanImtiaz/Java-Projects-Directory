
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! private int x;
            
        public void setX( int x )
        {
            this.x = x;
        }
        public int getX()
        {
            return x;
        }
        
        %>
        <% setX(10);
        %>
        <%= getX()%>
        
        
    </body>
</html>

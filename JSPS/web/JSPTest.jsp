

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            <%@include file = "style.css" %>
            </style>
    </head>
    <body>
        <% 
            for(int i = 1; i<10; i++){
                out.println("<h1 id = \"head\">Number:"+i+"</h1><br />");
            }
        %>
    </body>
</html>

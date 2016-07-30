

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <style>
           <%@include file  = "style.css" %>
           </style>
    </head>
    <body>
       <%
        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
        out.println("<head>");
        
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
        
        out.println("<title>SIS DUET</title>");
        out.println("</head>");
        out.println("<body id = \"body\">");
        //table div
        out.println("<div id = \"table-div\">");
        out.println("<table id = \"table-id\">");
        out.println("<tr class = \"table-row\">");
        out.println("<td>");
        out.println("Imtiaz");
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr class = \"table-row\">");
        out.println("<td>");
        out.println("Kamran");
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr class = \"table-row\">");
        out.println("<td>");
        out.println("Computer System Engineering");
        out.println("</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</div>"); //table div end
        out.println("</body>");
        out.println("</html>");
       %>
    </body>
</html>

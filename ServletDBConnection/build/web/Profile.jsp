
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            <%@include file = "css/sis.css" %>
            
        </style>
    </head>
    <body>
        <%@ page import="java.sql.*" %>
        <%! 
        private ResultSet rs;
        private String name;
        private String depart;
        %>
        <%
         response.setContentType("text/html;charset=UTF-8");
        
        ServletContext context = getServletContext();
       
        String username = request.getParameter("username");
        dbServlets.Database db = (dbServlets.Database)context.getAttribute("db");
        
          try{
        rs = db.runSql("select rollnumber,name,department from studentinfo where rollnumber=\'"+username+"\'");
        while(rs.next()){
            name = rs.getString("name");
            depart = rs.getString("department");
            System.out.println(name);
            System.out.println(depart);
        }
        }catch(SQLException e)
        {
            
        }
        
        
        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
        out.println("<head>");
        
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
        
        out.println("<title>SIS DUET</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div>");
        out.println("<div>");
        out.println("<table bordercolor=\"#CCCCCC\" align=\"center\" width=\"963\" height=\"20\">\n");
        out.println("<tr>");
        out.println(" <tr><td> <br /> <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"6\"  COLOR=\"#990000\"><b>"+name+ "</b> </FONT></td></tr>\n" +
"          ");
        out.println("<tr ><td>  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\"><b><br />"+username+"</b> </FONT></td></tr>");
        out.println("<tr \"row\"> <td> <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\"><b>"+depart+"</b></FONT></td></tr>");
        out.println("<tr \"row\"> <td> <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\"><b>Dawood University Of Engineering And Technology </b>");
        out.println(" <br /><br />");
        out.println("</FONT></td></tr>");
        out.println("</tr></table>");
        out.println("</div><div id=\"aqlb_menu\">");
        out.println("<div><ul>");
        out.println("<table width=\"919\" height=\"61\" class=\"button_01\">");
        out.println("<tr> <td width=\"190\" height=\"55\" class=\"button_01\"><a href=\"#\"><font color=\"#990000\" size=\"2\" > PROFILE</font></a></td>");
        out.println("<td width=\"195\"><a href=\"#\"><font color=\"#990000\" size=\"2\" >RESULT</font></a></td>");
        out.println("<td width=\"201\"><a href=\"#\"><font color=\"#990000\" size=\"2\" >ATTENDANCE</font></a></td>");
        out.println("<td width=\"205\"><a href=\"#\"><font color=\"#990000\" size=\"2\" >LIBRARY</font></a></td>");
        out.println("<td width=\"128\"><a href=\"#\"><font color=\"#990000\" size=\"2\" >FEES</font></a></td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</ul>");
        out.println("</div>");
        out.println("</div>");
        out.println("<center>");
        out.println(" Copyright © LAGHARI-wassan  <a href=\"#\"></a> <br /> ");
        out.println("</center>");
        out.println(" <br />");
        out.println("</body>");
        out.println("</html>");
       
        
        %>
    </body>
</html>

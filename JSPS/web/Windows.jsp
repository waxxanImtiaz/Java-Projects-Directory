

<html>  
   <head>
       <title>
           Welcome to jsp
       </title>
   </head>
<body>  
<%
    String name = request.getParameter("name");
    out.println( "Windows.jps<br />" );
    out.println("NAME:"+name);
    session.setAttribute("name", name);
    
%>  <br />
<a href = "welcome.jsp">Welcome to jsp</a>
<%= java.util.Calendar.getInstance().getTime() %><br />

</form>  
</body>  
</html>
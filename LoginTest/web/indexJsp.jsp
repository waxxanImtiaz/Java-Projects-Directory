<!DOCTYPE html>  
<html>  
<head>  
<meta charset="ISO-8859-1">  
<title>Servlet Login Example</title>  
</head>  
<body>  
  
<h1>Login App using HttpSession</h1>  
 <%
//                  RequestDispatcher rd = null;  
//                  session = request.getSession( false );
//                  response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
//                  response.setHeader("Cache-Control","no-store");
//                  response.setHeader("Pragma","no-cache"); //HTTP 1.0 
//                  response.setDateHeader ("Expires", 0);
//                  if( session != null){
//                        session.invalidate();
//                        rd = request.getRequestDispatcher("login.html");
//            
//                  }
//                      rd.forward(request, response);
                  
          %>
<a href="login.html">Login</a>|  
<a href="LogoutJSP.jsp">Logout</a>|  
<a href="ProfileServlet">Profile</a>  
  
</body>  
</html>

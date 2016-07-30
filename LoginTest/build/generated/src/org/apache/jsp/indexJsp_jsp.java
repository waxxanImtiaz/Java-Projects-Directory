package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>  \n");
      out.write("<html>  \n");
      out.write("<head>  \n");
      out.write("<meta charset=\"ISO-8859-1\">  \n");
      out.write("<title>Servlet Login Example</title>  \n");
      out.write("</head>  \n");
      out.write("<body>  \n");
      out.write("  \n");
      out.write("<h1>Login App using HttpSession</h1>  \n");
      out.write(" ");

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
                  
          
      out.write("\n");
      out.write("<a href=\"login.html\">Login</a>|  \n");
      out.write("<a href=\"LogoutJSP.jsp\">Logout</a>|  \n");
      out.write("<a href=\"ProfileServlet\">Profile</a>  \n");
      out.write("  \n");
      out.write("</body>  \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

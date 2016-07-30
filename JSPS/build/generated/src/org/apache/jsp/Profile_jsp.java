package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/style.css");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       <style>\n");
      out.write("           ");
      out.write("#body{\n");
      out.write("    color: #f22;\n");
      out.write("    font-size: 11pt;\n");
      out.write("    font-weight: 400;\n");
      out.write("/*    background-image: url(aqlb_search_bar.png);*/\n");
      out.write("}\n");
      out.write(".row{\n");
      out.write("     font-family:  Times New Roman;\n");
      out.write("     font-size: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#table-id{\n");
      out.write("    border: #f22 solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("           </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

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
       
      out.write("\n");
      out.write("    </body>\n");
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

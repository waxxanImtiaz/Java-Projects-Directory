package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_d_catch;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_d_catch = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_d_catch.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<!--        <h1>Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ param.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  </h1>-->\n");
      out.write("        \n");
      out.write("<!--        <c:set var=\"name\" value=\"imtiaz\" scope=\"page\" />\n");
      out.write("        Local variable:<c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("        <a href=\"ProfileTest.jsp\">Test Page</a>-->\n");
      out.write("\n");
      out.write("        <h1>newjsp page</h1>\n");
      out.write("           \n");
      out.write("          ");
      controller.Employee emp = null;
      synchronized (_jspx_page_context) {
        emp = (controller.Employee) _jspx_page_context.getAttribute("emp", PageContext.PAGE_SCOPE);
        if (emp == null){
          emp = new controller.Employee();
          _jspx_page_context.setAttribute("emp", emp, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("         \n");
      out.write("      \n");
      out.write("          \n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("emp"), request);
      out.write("<br />\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          ");

//            String name = emp.getName();
//            String id = emp.getId();
//            String age = emp.getAge();
//            out.println("<h1>Employee Information</h1><br />");
//            out.println("NAME:"+name+"<br />");
//            out.println("ID:"+id);
//            out.println("AGE:"+age);
          
      out.write("\n");
      out.write("          \n");
      out.write("          ");
      if (_jspx_meth_d_catch_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_d_catch_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:catch
    org.apache.taglibs.standard.tag.common.core.CatchTag _jspx_th_d_catch_0 = (org.apache.taglibs.standard.tag.common.core.CatchTag) _jspx_tagPool_d_catch.get(org.apache.taglibs.standard.tag.common.core.CatchTag.class);
    _jspx_th_d_catch_0.setPageContext(_jspx_page_context);
    _jspx_th_d_catch_0.setParent(null);
    int[] _jspx_push_body_count_d_catch_0 = new int[] { 0 };
    try {
      int _jspx_eval_d_catch_0 = _jspx_th_d_catch_0.doStartTag();
      if (_jspx_eval_d_catch_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("              int a = 10;\n");
          out.write("              \n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_d_catch_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_d_catch_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_d_catch_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_d_catch_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_d_catch_0.doFinally();
      _jspx_tagPool_d_catch.reuse(_jspx_th_d_catch_0);
    }
    return false;
  }
}

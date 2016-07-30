package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\" />\n");
      out.write("<title>SIS</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"megabg_container\">\n");
      out.write("<div id=\"bg_container\">\n");
      out.write("<div id=\"container\">\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<img src=\"img/top_img.jpg.png\" width=\"780\" height=\"230\" />\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("   \n");
      out.write("\t<div id=\"menu_sword\">\n");
      out.write("\t\t<div id=\"tabs\" class=\"noprint\">\n");
      out.write("\t\t<h3 class=\"noscreen\">Navigation</h3>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.jsp\" class=\"sword_menu\"><span class=\"shadow\">&nbsp;PROFILE&nbsp;</span><span class=\"text\">&nbsp;PROFILE&nbsp;</span><span class=\"tab-l\"></span><span class=\"tab-r\"></span></a></li>\n");
      out.write("                <li><a href=\"result.jsp\" class=\"sword_menu\"><span class=\"shadow\">&nbsp;RESULT&nbsp;</span><span class=\"text\">&nbsp;RESULT&nbsp;</span><span class=\"tab-l\"></span><span class=\"tab-r\"></span></a></li>\n");
      out.write("                <li><a href=\"attendance.jsp\" class=\"sword_menu\"><span class=\"shadow\">&nbsp;ATTENDANCE&nbsp;</span><span class=\"text\">&nbsp;ATTENDANCE&nbsp;</span><span class=\"tab-l\"></span><span class=\"tab-r\"></span></a></li>\n");
      out.write("                <li><a href=\"library.jsp\" class=\"sword_menu\"><span class=\"shadow\">&nbsp;LIBRARY&nbsp;</span><span class=\"text\">&nbsp;LIBRARY&nbsp;</span><span class=\"tab-l\"></span><span class=\"tab-r\"></span></a></li>                                                \n");
      out.write("           <li><a href=\"#\" class=\"sword_menu\"><span class=\"shadow\">&nbsp;FEES&nbsp;</span><span class=\"text\">&nbsp;FEES&nbsp;</span><span class=\"tab-l\"></span><span class=\"tab-r\"></span></a></li>  \n");
      out.write("           <li><a href=\"#\" class=\"sword_menu\"><span class=\"shadow\">&nbsp;LOGOUT&nbsp;</span><span class=\"text\">&nbsp;LOGOUT&nbsp;</span><span class=\"tab-l\"></span><span class=\"tab-r\"></span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        <hr class=\"noscreen\" />\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t<div id=\"body\">\n");
      out.write("\t\t<div id=\"body-rightside\">\n");
      out.write("        <table border=\"4\">\n");
      out.write("        <tr>\n");
      out.write("         <td><img src=\"img/4.jpg\" width=\"150\" height=\"187\"  /></td>\n");
      out.write("\t\t</tr></table>\n");
      out.write("         </div>\n");
      out.write("\t\t<div id=\"body-leftside\">\n");
      out.write("\t\t<h1>PROFILE </h1>\n");
      out.write("\t\t<p class=\"justify\">\n");
      out.write("\t\t\t<table align=\"center\" width=\"963\" height=\"20\">\n");
      out.write("           \n");
      out.write("        <tr>\n");
      out.write("        \n");
      out.write("          <tr><td> <br /> <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"5\"  COLOR=\"#990000\"><b>Abdul Qayyum Laghari </b> </FONT></td></tr>\n");
      out.write("          <tr><td>  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"3\"  COLOR=\"#990000\"><b>D_13_cs_30</b> </FONT></td></tr>\n");
      out.write("          <tr> <td> <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"3\"  COLOR=\"#990000\"><b>Computer Systm Engineering</b></FONT></td></tr>\n");
      out.write("          <tr> <td> <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"3\"  COLOR=\"#990000\"><b>Dawood University Of Engineering And Technology </b> \n");
      out.write("           <br /><br />\t\n");
      out.write("          </FONT></td></tr>\n");
      out.write("          \n");
      out.write("       </tr>\n");
      out.write("       </table>\n");
      out.write("       \n");
      out.write("       <div >\n");
      out.write("            <table border=\"4\" align=\"center\" width=\"780\">\n");
      out.write("            <tr><td colspan=\"2\" width=\"395\"> <br /> <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"5\"  COLOR=\"#990000\"><b>PERSONEL INFORMATION</b> </FONT></td></tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\" >  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">ID </FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">D_13_cs_30 </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">FATHER NAME </FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">ASHIQUE ALI </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          \n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">CASTE </FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">LAGHARI </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">C NIC </FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">45504-3352684-7</FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">ADDRESS </FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">BALOUCH MOHALLAH UPPER QUEENS ROAD SUKKUR </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">PERMANENT ADDRESS </FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">VILLAGE BHIRI LAGHARI DISTRICT GHOTKI </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">GNDER</FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">MALE </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">CONTACT </FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">0312 4381011 </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">FATHER CONTACT </FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">0300 3987447 </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">E_MAIL</FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">qayoom.laghari@yahoo.com </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          </table><br />\n");
      out.write("          <table border=\"4\" align=\"center\" width=\"780\">\n");
      out.write("          <tr><td colspan=\"2\" width=\"395\"> <br /> <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"5\"  COLOR=\"#990000\"><b>EDUCATION</b> </FONT></td></tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">matriculation</FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">BISE SUKKUR (\"A\" GRADE) </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">INTERMEDIATE</FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">BISE SUKKUR (\"B\" GRADE) </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          \n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">GRADUATION </FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">IF ANY </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          </table><br />\n");
      out.write("          <table border=\"4\" align=\"center\" width=\"780\">\n");
      out.write("          <tr><td colspan=\"2\" width=\"395\"> <br /> <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"5\"  COLOR=\"#990000\"><b>OTHER INFORMATION</b> </FONT></td></tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">TECHNICAL SILLS</FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">MICROSOFT OFFICE , C++ , HTML , CSS , PHP ,hands on practice of DATABASE  </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">INTERENSHIP</FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">4 WEEKS AT NIT (NATIONAL INVESTMENT TRUST) , @ WEEKS AT PIA (PAKISTAN INTERNATIONAL AIRLINE)</FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          \n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">PROJECT </FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">WEBSITE , STUDENT INFORMATION SYSTEM </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">ACTIVITIES SPORTS/ELSE</FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">TABLE TENNIS AND CRICKET</FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">AREA OF INTEREST</FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">- </FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          \n");
      out.write("          <tr>\n");
      out.write("          <td width=\"395\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">LANGUAGES</FONT></td>\n");
      out.write("          <td width=\"557\">  <FONT FACE=\"Times New Roman, Times, serif\" SIZE=\"4\"  COLOR=\"#990000\">ENGLISH , SINDHI , URDU , SIRAIKI , PUNJABI</FONT></td>\n");
      out.write("          </tr>\n");
      out.write("          \n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("     \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("      <br />\t\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div class=\"hr\"><hr/></div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"designedby\">\n");
      out.write("\t\t\t<br />\n");
      out.write("          Copyright ©  LAGHARI-WASSAN -- Designed And Developed By Abdul qayyum Laghari - Imtiaz Ali Wassan<br />\n");
      out.write("           \n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
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

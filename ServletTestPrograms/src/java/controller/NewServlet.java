
package controller;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.*;
import java.util.*;

public class NewServlet extends GenericServlet {
    public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
            
    {
      PrintWriter out = res.getWriter();
      ServletConfig conf = getServletConfig();
      String age = conf.getInitParameter("age");
      Vector v = new Vector();
      
      Enumeration e = conf.getInitParameterNames();
      String serName = getServletName();
      e.hasMoreElements();
      out.println("<h1>"+age+"</h1>");
      out.println("<h1>InitParameter names "+e.nextElement()+"</h1>");
      out.println("<h1>Servlet name is "+serName+"</h1>");
      log("Hello world");
    }
   

}

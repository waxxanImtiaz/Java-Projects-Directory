
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
public class Servlet1 extends HttpServlet {

    @Override
   public void doGet( HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();
       
       ServletContext con = getServletContext();
       
       con.setAttribute("company", "Google");
       
       
       out.println("<h1>Welcome</h1>");
       out.println("<h1><a href = 'Servlet2'>Visit</a></h1>");
       
      out.close();
   }

    
}

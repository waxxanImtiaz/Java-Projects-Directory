
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Profile extends HttpServlet {

   @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        doPost(request,response);
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        String id = null;
        String sessionId = "2";
        try{
        if(session  != null  ){
        id = session.getId();
        sessionId = session.getAttribute("sessionId").toString();
        }
        //out.println("<h1>"+session+"</h1>");
        if( id == sessionId ){
        
            String username = session.getAttribute("username").toString();
            out.println("<h1>Hello "+username+"</h1>");
            out.println("<a href = 'Logout.jsp'>Logout</a>");
        
        }else
        {
            response.sendRedirect("index.html");
        }
        }catch( NullPointerException e)
        {
            
            response.sendRedirect("index.html");
        }
        }
  
      
    
    }

  


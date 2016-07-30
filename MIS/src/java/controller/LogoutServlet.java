/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
import javax.servlet.*;
public class LogoutServlet extends HttpServlet {  
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            HttpSession session=request.getSession(false); 
            try{
            if( session != null )
            {
            session.removeAttribute("username");
            session.removeAttribute("pInfo");
            session.removeAttribute("edu");
            session.removeAttribute("otherInfo");
            session.invalidate();
            out.println("<h1 style = 'color: green;'>You logged out succesfully</h1>");
            request.getRequestDispatcher("indexpage.html").include(request, response);
             
             response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
             response.setHeader("Cache-Control","no-store");
             response.setHeader("Pragma","no-cache"); //HTTP 1.0 
             response.setDateHeader ("Expires", 0);
             response.sendRedirect("indexpage.html");
            }else
            {
                  response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
                  response.setHeader("Cache-Control","no-store");
                  response.setHeader("Pragma","no-cache"); //HTTP 1.0 
                  response.setDateHeader ("Expires", 0);
                  response.sendRedirect("indexpage.html");
               
            }   
            }catch( Exception e )
            {             
                request.getRequestDispatcher("indexpage.html").include(request, response);
                out.println("<h1 style = 'color: blue;'>Please login first</h1>");
            }
    }  
}
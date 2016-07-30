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
public class ProfileServlet extends HttpServlet {  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                      throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
          
        HttpSession session=request.getSession(false);
        try{
        if( session == null){
        response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache"); //HTTP 1.0 
        response.setDateHeader ("Expires", 0);
        }
        String userName = null;
        if(session != null){
         userName = (String) session.getAttribute("name");
        
          if( (userName != null))
            out.print("Hello, "+userName+" Welcome to Profile");  
            else{
            request.getRequestDispatcher("login.html").include(request, response);
            out.print("<h1 style = 'color: red;'>Please login first</h1>");
            }
            }else
            {
            request.getRequestDispatcher("login.html").include(request, response);
            out.print("<h1 style = 'color: green'>Please login first</h1>");
            
            }
        }catch( Exception e )
        {
            
           // request.getRequestDispatcher("login.html").include(request, response);
            out.println("<a href = 'login.html'>Login</a>");
            out.println("<h1 style = 'color: blue;'>Please login</h1>");
        }
        out.close();
        
    }  
} 
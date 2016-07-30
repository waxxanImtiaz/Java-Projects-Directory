
package controller;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
public class LoginServlet extends HttpServlet { 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        String name=request.getParameter("name");  
        String password=request.getParameter("password"); 
        HttpSession session=request.getSession();
        if(session == null){
        request.getRequestDispatcher("link.html").include(request, response);
        response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache"); //HTTP 1.0 
        response.setDateHeader ("Expires", 0);
        
        
        }
       
        if(password.equals("123")){          
        session.setAttribute("name",name); 
        request.getRequestDispatcher("link.html").include(request, response);
        }  
        else{  
            out.print("Sorry, username or password error!<br />");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }
            
        out.close();  
    }  
} 
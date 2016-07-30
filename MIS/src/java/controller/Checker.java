
package controller;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Checker implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {        
        
        

    
    }
   @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        PrintWriter out = response.getWriter();

        String username = request.getParameter( "username" );
        String password = request.getParameter( "pass" );

            chain.doFilter(request, response);
            if( username.equals("") ){
                out.println("<h1>User name is required</h1>");
                //chain.doFilter(request, response);
                
                }
            else if( password.equals(""))
            {
                out.println("<h1>Password is required</h1>");
                    
            }
            else{
               
                out.println("<div style = \"border: 2px solid blue;\">");
                out.println("<pre>");
                chain.doFilter(request, response);
                out.println("</pre>");
                out.println("</div>");
            }
               
               
    }
    
    
   @Override
    public void destroy() {        
        System.out.println("destroy method invoked");
    }

    
    

    
   
    
}

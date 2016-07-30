
package controller;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FilterTest implements Filter {    
    
    @Override
    public void init(FilterConfig filterConfig) {        
       
        String key = filterConfig.getInitParameter("key");
        
          System.out.println("key ="+key);
    }  
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
      PrintWriter out = response.getWriter();
      
      String name = request.getParameter("name");
      String email = request.getParameter( "email" );
      
      try{
          
//          Class.forName("oracle.jdbc.driver.OracleDriver");
//          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr", "12345");
//          Statement st = con.createStatement();
//          out.println("Connection is successful");
      }catch( Exception e)
      {
          out.println("connection failed");
      }
     
        if( name.equals( "" ) )
        {
            out.println( "Name is required" );
        }
        else if( email.equals("") )
            out.println( "Email is required" );
         
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
        System.out.println("Filter destroy");
    }

   
  


    
}

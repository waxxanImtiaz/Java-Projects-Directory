
package controller;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
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
      int marks = 0;
      
      try{
          marks = Integer.parseInt(request.getParameter("marks"));
      }catch( Exception e  )
      {
         // out.println( "marks are not valid" );
      }
        if( name.equals( "" ) )
        {
            out.println( "Name is required" );
        }
        else if( email.equals("") )
            out.println( "Email is required" );
         else  if( marks == 0 )
            out.println( "Marks are required" );
           else
            chain.doFilter(request, response);
    }
    @Override
    public void destroy() { 
        System.out.println("Filter destroy");
    }

   
  


    
}

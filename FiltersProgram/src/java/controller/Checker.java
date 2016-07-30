
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


public class Checker implements Filter {
    
    @Override
    public void init(FilterConfig filterConfig) {        
       
        
        }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        String name = request.getParameter("name");
        
        PrintWriter out = response.getWriter();
        chain.doFilter(request, response);
//        if(name.equals("")){
//            out.println("<h1>Name is required</h1>");}
        
//            chain.doFilter(request, response);
//        }
//        else
//            chain.doFilter(request, response);
//        
    }

    @Override
    public void destroy() {        
    }

   

 
}

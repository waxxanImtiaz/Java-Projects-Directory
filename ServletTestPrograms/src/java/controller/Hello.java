
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Hello implements Servlet{
            
            int num1;
            int num2;
            
            @Override
            public void init( ServletConfig sc )
            {
                int code = sc.hashCode();
                System.out.println("hashcode of ServetConfig object is "+code);
            }
            @Override
            public void service( ServletRequest req,ServletResponse res) throws ServletException,IOException{
                res.setContentType("text/html");
                PrintWriter out = res.getWriter();
              
                num1 = Integer.parseInt(req.getParameter("num1"));
                num2 = Integer.parseInt(req.getParameter("num2"));
                
                 out.println( "<body style = \"background: green;\" >");
                 out.println( "<h1 >");
                 out.println( "NAME:"+(num1+num2) );
                 out.println( "</h1>");
                 out.println( "</body>");
                
                
            }
            @Override
            public ServletConfig getServletConfig()
            {
                System.out.println("getServletConfig method executed");
                return null;
            }
            @Override
            public String getServletInfo()
            {
                return null;
            }
            @Override
            public void destroy()
            {
                System.out.println("destroy method called");
                
            }
}

  


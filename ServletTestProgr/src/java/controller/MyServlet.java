
package controller;

import java.io.*;
import javax.servlet.*;
import java.util.*;

public class MyServlet implements Servlet {
    String name;
    String age;
    ServletConfig conf;
    public void init( ServletConfig con )
    {
        this.conf = con;
        System.out.println("Init method called");
        name = conf.getInitParameter("age");
        age = conf.getServletContext().getInitParameter("name");
    }
    public void service( ServletRequest req,ServletResponse res ) throws IOException,ServletException
    {
        Cookie[] cookie = req.
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<h1>Your name is "+name+"</h1>");
        out.println("<h1>Your age is "+age+"</h1>");
    }
    public void destroy(){
        System.out.println("destroy method is invoked");
    }
    public ServletConfig getServletConfig(){
        return conf;
    }
    public String getServletInfo(){
        return "MyServlet";
    }
}

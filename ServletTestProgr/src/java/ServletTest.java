import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

public class ServletTest implements Servlet {
    private String age;
    private String dob;
    private String height;
    @Override
    public void init( ServletConfig con ){
        age = con.getInitParameter("age");
        height = con.getServletContext().getInitParameter("height");
        dob = con.getInitParameter("dob");
    }
    @Override
    public void service( ServletRequest req,ServletResponse res ) throws ServletException,IOException
    {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        Object n = req.getAttribute("id"); 
        PrintWriter out = res.getWriter();
        
        
        out.print("<h1>Name is "+name+"</h1>");
        
        out.print("<h1>Email is "+email+"</h1>");
        out.print("<h1>Servlet info is "+getServletInfo()+"</h1>");
        out.print("<h1>Attribute is "+n+"</h1>");
        out.print("<h1>Age is "+age+"</h1>");
        out.print("<h1>Height is "+height+"</h1>");
         out.print("<h1>Date of birth is "+dob+"</h1>");
    }
    public String getServletInfo(){
        return "\"This is my Servlet\"";
    }
    public ServletConfig getServletConfig(){
        return null;
    }
    public void destroy()
    {
    }
}
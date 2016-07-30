
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class ServletOne extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        
        String name = req.getParameter("name");
        
       // System.out.println("forward to the next servlet");
        //out.println( "<h1>Your name is :"+name+"</h1>" );
        
        RequestDispatcher rd = req.getRequestDispatcher("/next" );
          System.out.println("Forwarding.....");
        rd.forward(req, res);
        
    }

    
}

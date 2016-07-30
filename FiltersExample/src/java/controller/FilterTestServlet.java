
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FilterTestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        
        String email = request.getParameter("email");
        
        int marks = Integer.parseInt(request.getParameter("marks"));
        
        out.println( "Name:"+name );
        out.println( "Email:"+email );
        out.println( "Marks:"+marks );
        
        }
    }

  


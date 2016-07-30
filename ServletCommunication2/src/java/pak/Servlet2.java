/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pak;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author waxxan
 */
public class Servlet2 extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter( "address" );
        out.println( "<body style = \" background: green;\">" );
        out.println( "<h1>" );
        out.println( "NAME:"+name );
        out.println( "</h1>" );
        out.println( "<h1>" );
        out.println( "EMAIL:"+email );
        out.println( "</h1>" );
        out.println( "<h1>" );
        out.println( "ADDRESS:"+address );
        out.println( "</h1>" );
        out.println( "</body>" );
        }
    }




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class ValidationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        
        PrintWriter out = res.getWriter();
        
        out.println( "<h1>NAME:"+name+"</h1>" );
        
        out.println( "<h1>EMAIL:"+email+"</h1>" );
        
        out.println( "<h1>ADDRESS:"+address+"</h1>" );
        
        System.out.println( "Go to next servlet" );
        
        RequestDispatcher rd = req.getRequestDispatcher( "/RegistrationServlet" );
        
        rd.include(req, res);
        }
    }

   


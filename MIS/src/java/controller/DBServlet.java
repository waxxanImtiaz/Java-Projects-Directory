
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

public class DBServlet extends HttpServlet {

    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html");
        boolean flag;
        Database db = (Database) getServletContext().getAttribute("db");
	
        PrintWriter out = response.getWriter();
        
        String sql = "select * from login";
	
        ResultSet rs;
        
        String username = request.getParameter("username");
        
        String password = request.getParameter("password");
        flag = false;
        try {
                rs = db.runSql(sql);
                         
		while(rs.next())
                    {
                        System.out.println(rs.getString("username"));
                        System.out.println(rs.getString("password"));
                      if(rs.getString("username").equals(username)&&(rs.getString("password").equals(password)))
                      { 
                          flag = true;
                          break;
                      }
                                   
                    }//end of while loop
                 
                if( flag ){
                    HttpSession session = request.getSession();
                    session.setAttribute("username", username);
                  
                    response.sendRedirect( "SetterServlet" );
                     
                        } //end of if
                else{
                    
                     out.println( "<p style='background: white;'>Username or password is incorrect</p>" );
                     request.getRequestDispatcher("indexpage.html").include(request,response);
                    }
                    //end of else if
             }catch(SQLException e){
              System.out.println(e.getMessage());
               }//end of catch
        
            
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }
    
}

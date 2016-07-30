
package dbServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;

public class DBServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
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
		} catch (SQLException e) {
			
			out.println("<h1>"+e.getSQLState()+"</h1>");
		}
        if( flag ){
        out.println( "<h1>Login succesful.</h1>" );
        RequestDispatcher rd=request.getRequestDispatcher("Profile.jsp");  
        rd.forward(request, response);  
        }
        else
            out.println( "<body style = \"background: green;\"><h1 style = \"color: blue; border: solid 1px green;\">Username or password is incorrect</h1></h1>" );
      
        
            
    }

    
}

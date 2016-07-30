
package Registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.*;

public class CreateDatabase implements Servlet
{
        @Override
	public void init( ServletConfig con )
	{
		
		System.out.println( "init method called" );
		
	}
	
        @Override
	public void service( ServletRequest req,ServletResponse res )
	throws ServletException,IOException
	{
            PrintWriter out = res.getWriter();
            
                   
                     try{
                        //load class
                        Class.forName( "com.mysql.jdbc.Driver" );
                	
                        //create connection
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/","root","12345" );
                        
                        //create statement
                        Statement st = con.createStatement();
                        
                        //create database..
                        int tester = st.executeUpdate("create database registration");
                        
                        out.println( "<body>" );
                        out.println( "<font color = \"Blue\"><h1>Database created</h1></font>" );
                        out.println( "</body>" );
                    
                     }
                     catch( SQLException e )
                     {
                        out.println( "<body>" );
                        out.println( "<font color = \"Blue\"><h1>SQLException"+e.getMessage()+"</h1></font>" );
                        out.println( "</body>" );
                    
                     }    
                     catch( ClassNotFoundException e )
                     {
                        out.println( "<body>" );
                        out.println( "<font color = \"Blue\"><h1>CNFE:"+e.getMessage()+"</h1></font>" );
                        out.println( "</body>" );
                     }
        }
         @Override
	public ServletConfig getServletConfig( )
	{
		return null;
	}
        @Override
	public String getServletInfo()
	{
		return "Servlet info method";
	}
        @Override
	public void destroy()
	{
		
	}
}
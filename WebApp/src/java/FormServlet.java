import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class FormServlet implements Servlet
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
		String name = req.getParameter( "p" );
		String surname = req.getParameter( "surname" );
		String address = req.getParameter( "address" );
		
		
		
		try{
                        //load class
			Class.forName( "com.mysql.jdbc.Driver" );
			
                        //create connection
			Connection con = DriverManager.getConnection(  "jdbc:mysql://localhost/testdb","root","12345"  );
			
                        //create statement..
                        Statement ps = con.createStatement();
                        String sql = "insert into ser values( '"+name+"','"+surname+"','"+address+"' )";
                        int executeUpdate = ps.executeUpdate( sql );
                       
                        if( executeUpdate != 0 )
                        {
                        out.println( "<body>" );
			out.println( "<font color = \"Blue\"><h1>"+executeUpdate+" rows effected</h1></font>" );
			out.println( "</body>" );
                        }
                                
		}catch( SQLException e )
		{
			out.println( "<body>" );
			out.println( "<h1>Exception:"+e.getMessage()+"</h1>" );
			out.println( "</body>" );
		}catch( ClassNotFoundException e )
		{
			out.println( "<h1>Class not found</h1>" );
		}
	}//end of service method...
	
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
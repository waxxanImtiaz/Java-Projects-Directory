package Registration;

import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class CourseReg implements Servlet
{
        private Connection con;
        private ServletResponse res;
        @Override
	public void init( ServletConfig conf )
	{
		String driver = conf.getServletContext().getInitParameter("driver");
                String url = conf.getServletContext().getInitParameter( "url" );
                String userName = conf.getServletContext().getInitParameter( "userName" );
                String password = conf.getServletContext().getInitParameter( "password" );
		
                try{
                    Class.forName( driver );
                    
                    con = DriverManager.getConnection( url,userName,password );
                }catch( Exception e )
                {
                 e.printStackTrace();
                }
	}
	
        @Override
	public void service( ServletRequest req,ServletResponse res )
	throws ServletException,IOException
	{
            
                   PrintWriter out = res.getWriter();
                   this.res = res;
                    out.println( "<body>" );
                    out.println( "<font color = \"Blue\"><h1>Course Registration</h1></font>" );
                    out.println( "</body>" );
                   try{
                        //create statement
                        Statement st = con.createStatement();
                        
                         //get parameters
                         int courseId = Integer.parseInt(req.getParameter( "courseId" ));
                         
                         String studentName = req.getParameter( "studentName" );
                         
                         
                         //insert data into a table
                         
                         int tester = st.executeUpdate( "insert into course values("+courseId+",'"+studentName+"')" );
		
                         //check
                         if( tester != 0 )
                            {
                            out.println( "<font color = \"Blue\"><h1>Data inserted successfully</h1></font>" );
                            }
             
                     else
                        {
                            throw new Exception( " data not inserted " );
                        }
                    
                         con.close();
                    }catch( ClassNotFoundException e )
                    {
                        out.println("<h1>IOException:"+e.getMessage()+"</h1>");
        
                    }
                   catch( Exception e)
                    {
                        out.println("<h1>Exception:"+e.getMessage()+"</h1>");
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
                PrintWriter out = null;
                try{
                 out = res.getWriter();
                }catch( IOException e )
                {
                    
                }
		try{
                   out.println( "<body>" );
                   out.println( "<font color = \"Blue\"><h1>Destroy method is called</h1></font>" );
                   out.println( "</body>" );
                    
                    con.close();
                }catch( SQLException e )
                {
                   out.println( "<body>" );
                   out.println( "<font color = \"Blue\"><h1>Connection not closed</h1></font>" );
                   out.println( "</body>" );
                   
                }
	}
}
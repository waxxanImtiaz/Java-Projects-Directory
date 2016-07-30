
package Registration;

import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class StudentReg implements Servlet
{
        private Connection con = null;
        private String driver;
        private String url;
        private String userName;
        private String password;
        private ServletConfig conf;
        private ServletResponse res;
        @Override
	public void init( ServletConfig conf )
	{
		
                this.conf= conf;
		driver = conf.getServletContext().getInitParameter("driver");
                url = conf.getServletContext().getInitParameter( "url" );
                userName = conf.getServletContext().getInitParameter( "userName" );
                password = conf.getServletContext().getInitParameter( "password" );
                    
                try{
                        
                Class.forName( driver );
                    
                con = DriverManager.getConnection( url,userName,password );
                
                 }catch( Exception e )
                 {
                
                 }
                  
                
	}
	
        @Override
	public void service( ServletRequest req,ServletResponse res )
	throws ServletException,IOException
	{
            
                   PrintWriter out = res.getWriter();
            
                    out.println( "<body>" );
                    out.println( "<font color = \"Blue\"><h1> Registration</h1></font>" );
                    out.println( "</body>" );
                
                   
                    out.println( "<body>" );
                    out.println( "<font color = \"Blue\">Driver:"+driver+"</h1></font>" );
                    
                    out.println( "<font color = \"Blue\">username:"+userName+"</h1></font>" );
                    
                    out.println( "<font color = \"Blue\">password:"+password+"</h1></font>" );
                    
                    out.println( "<font color = \"Blue\">url:"+url+"</h1></font>" );
                    out.println( "</body>" );
                    
                    
                    try{
                        
                        //create statement
                        out.println( "<body>" );
                        out.println( "<font color = \"Blue\"><h1>Statement creating .</h1></font>" );
                        out.println( "</body>" );
                        
                        Statement st = con.createStatement();
                        
                         out.println( "<body>" );
                         out.println( "<font color = \"Blue\"><h1>Statement created .</h1></font>" );
                         out.println( "</body>" );
                        //get parameters
                         int rollNumber = Integer.parseInt(req.getParameter( "rollNumber" ));
                         
                         String studentName = req.getParameter( "studentName" );
                         
                         String cast = req.getParameter( "cast" );
                         
                         //insert data into a table
                            
                         int tester = st.executeUpdate( "insert into student values("+rollNumber+",'"+studentName+"'"
                                 + ",'"+cast+"')" );
		
                         //check
                         if( tester != 0 )
                            {
                            out.println( "<font color = \"Blue\"><h1>Data inserted successfully</h1></font>" );
                            }
                        else
                        {
                            out.println( "<h1> data not inserted</h1> " );
                        }    
                 
                    } catch( SQLException e)
                    {
                        out.println("<h1>SQLException:"+e.getMessage()+"</h1>");
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
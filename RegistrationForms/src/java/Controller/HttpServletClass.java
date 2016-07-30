
package Controller;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class HttpServletClass extends HttpServlet {
    
    private HttpSession hs;
    private String name;
    private String age;
    private String father_name;
    private String qualification;
    private String address;
    private String cast;
    
    @Override
    public void doGet( HttpServletRequest req,HttpServletResponse res )
    throws ServletException,IOException
    {
        PrintWriter out = res.getWriter();
        
        String form = req.getParameter( "form" );
        
        if( form.equals( "1" ) )
        {
            name = req.getParameter( "name" );
            cast = req.getParameter( "cast" );
            
            hs = req.getSession();
            
            hs.setAttribute("name", name);
            hs.setAttribute("cast", cast);
            
            res.sendRedirect( "Form2.html" );
        }
        else if( form.equals("2" ) )
        {
            father_name = req.getParameter( "fName" );
            address = req.getParameter( "address" );
            out.println( "<h1>Address:"+address+"</h1>" );
            hs.setAttribute( "fName",father_name );
            hs.setAttribute( "ad", address );
            
           res.sendRedirect( "Form3.html" );
           
        }
        
        else if( form.equals( "3" ) )
        {
            qualification = req.getParameter( "qualification" );
            age = req.getParameter( "age" );
            
            hs.setAttribute( "qualification",qualification );
            hs.setAttribute( "age" , age);
            
           //store into database....
            
            
            name = (String)hs.getAttribute("name");
            age = ( String )hs.getAttribute( "age" );
            qualification = ( String )hs.getAttribute( "qualification" );
            father_name = ( String )hs.getAttribute( "fName" );
            cast = ( String )hs.getAttribute( "cast" );
            address = ( String )hs.getAttribute( "ad" );
            
            
            //create dynamic html page
            out.println( "<body >" );
            out.println( "<font color = \"BLUE\">" );
            out.println( "<h1>Name:"+name+"</h1>" );
            out.println( "<h1>Father Name:"+father_name+"</h1>" );
            out.println( "<h1>Cast:"+cast+"</h1>" );
            out.println( "<h1>Age:"+age+"</h1>" );
            out.println( "<h1>Address:"+address+"</h1>" );
            out.println( "<h1>Qualification:"+qualification+"</h1>" );
            out.println( "</font>" );
            out.println( "</body>" );
            
            
            try{
           
             Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","12345");  
            
            PreparedStatement pst = con.prepareStatement("insert into servlet_user_data values(?,?,?,?,?,?)");
            
            pst.setString( 1, name );
            pst.setString( 2,father_name );
            pst.setString( 3, cast );
            pst.setString( 4,age );
            pst.setString( 5,qualification );
            pst.setString( 6, address );
            
            int flag = pst.executeUpdate();
            
            if( flag != 0 ){       
                       out.println( "<h1>Data inserted</h1>" );
            }
            else
            {
                out.println( "<h1>Data not inserted</h1>" );   
            }//end of if-else
        }catch( Exception e )
        {
          out.println( "<h1>"+e.getMessage()+"</h1>" );      
        }
         }
    }//end of method doGet..
}

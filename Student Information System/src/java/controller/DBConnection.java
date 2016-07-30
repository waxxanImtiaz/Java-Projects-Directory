
package controller;

import javax.servlet.*;  
import java.sql.*;  
  
public class DBConnection implements ServletContextListener{  

    @Override
    public void contextInitialized(ServletContextEvent event) {  
    try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  

        Connection con=DriverManager.getConnection(  
                        "jdbc:oracle:thin:@localhost:1521:ORCL","hr","12345");  
          

                    //storing connection object as an attribute in ServletContext  
                    ServletContext ctx=event.getServletContext();  
                    ctx.setAttribute("mycon", con);  
          
      }catch(Exception e){e.printStackTrace();}  
}  
  
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {}  
 }  
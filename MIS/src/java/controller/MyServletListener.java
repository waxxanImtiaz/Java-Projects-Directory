
package controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

 

public class MyServletListener implements ServletContextListener
{
 
    @Override
    public void contextInitialized(ServletContextEvent event) {
 
    	ServletContext sc = event.getServletContext();
 
    	
    	String user_name = "hr";
    	String password = "12345";
    	String url = "jdbc:odbc:HR";
    	Database db = new Database(url, user_name, password);
    	sc.setAttribute("db", db);
        System.out.println("Listener class");
    }
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
   }
 
}
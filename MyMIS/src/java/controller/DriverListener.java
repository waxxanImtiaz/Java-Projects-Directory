/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Web application lifecycle listener.
 *
 * @author waxxan
 */
public class DriverListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
    
        ServletContext sc = sce.getServletContext();
    	  try{
                    
                Configuration cf = new Configuration();
                cf.configure("xmlFiles/hibernate.cfg.xml");
                SessionFactory sf = cf.buildSessionFactory();
                sc.setAttribute("sessionFactory", sf);
                
          }catch(Exception e)
          {
              
          }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

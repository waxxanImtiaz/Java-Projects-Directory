/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import beans.*;
import controller.XmlFileWriter;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author waxxan
 */
public class Checker extends HttpServlet {
    private Master master;
    private SessionFactory sf;
    private Session ses;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        String username = request.getParameter("username");
        String password  = request.getParameter("password");
        
        SessionFactory sf = (SessionFactory)request.getServletContext().getAttribute("sessionFactory");
        Session ses = sf.openSession();
        
        master = (Master)ses.get(Master.class, username);
      //  ses.close();
        boolean isOk = master != null && master.getDepart().equalsIgnoreCase(username);
        if( isOk )
        {
            response.getWriter().println("chairman is logged in");
        }
        else{
            String depart = null;
            String batch = null;
            String rollNum = null;
            String temp = null;
            if(username.contains("_"))
            {
                
                //get batch from username
                batch = username.substring(0,username.indexOf("_", 0));
                
                temp = username.substring(username.lastIndexOf("_", username.indexOf("_",0))+1);
                
                if(temp.contains("_")){
                //get depart from username
                depart = temp.substring(0,username.indexOf("_", 0));
                 
                    rollNum = username;
                 
                response.getWriter().println("depart="+depart);
                response.getWriter().println("batch="+batch);
                response.getWriter().println("rollNum="+rollNum);
                
                
               
//                response.getWriter().println((XmlFileWriter.writeTableName(depart.toUpperCase()+"_"+batch+"_STUDENTS")) ? "table name assigned":"table name not assgined");
               
                XmlFileWriter.writeTableName("Casdf");
//                sf.getCurrentSession();
//               // ses = sf.openSession();
//                
//                ses.beginTransaction().commit();
//                beans.StudentPersonalInfo p = (beans.StudentPersonalInfo)ses.get(beans.StudentPersonalInfo.class, rollNum.toUpperCase());
//                 
//               if(p != null){
//                response.getWriter().println(p.getName());
//                response.getWriter().println(p.getRollNum());
//                response.getWriter().println(p.getBatch());
//                response.getWriter().println(temp);
//                response.getWriter().println(batch);
//                
//                response.getWriter().println(depart);
//                }
//               else{
//                   response.getWriter().println("p in null");
//               }
                }
                else{
                    response.getWriter().println("password is not correct");
                }//end of else
               
            }else
                 response.getWriter().println("password is not correct");
        }
    }//end of run method
       

  
    @Override
    public String getServletInfo() {
        return "This is Id and password checker servlet";
    }// </editor-fold>

}

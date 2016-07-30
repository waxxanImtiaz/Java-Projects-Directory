/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import java.util.*;
import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.hibernate.mapping.Table;
public class Driver {
            
            public static void main( String[] args )
            {
                Student s = new Student();
                s.setId(4);
                s.setName("Amjad");

                try{
                    
                Configuration cf = new Configuration();
                 cf.configure("xml/hibernate.cfg.xml");   
                SessionFactory sf = cf.buildSessionFactory();
                Session ses = sf.openSession();
                
                ses.save(s);
                ses.beginTransaction().commit();
                ses.evict(s);
                
                ses.close();
//                
               // ses = sf.openSession();
                
               // s = (Student)ses.get(Student.class, 1);
               // System.out.println("Name="+s.getName());
//                System.out.println("Id="+s.getId());
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
}

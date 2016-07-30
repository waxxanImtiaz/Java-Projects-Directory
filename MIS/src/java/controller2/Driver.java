package controller2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import beans.Master;
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
import beans.DepartAndBatches;
import beans.StudentPersonalInfo;
public class Driver {
            
            public static void main( String[] args )
            {
                //DepartAndBatches table object
                DepartAndBatches db = new DepartAndBatches();
                db.setDepart("CS");
                db.setBatch("17");
                
                //StudetPersonalInfo table object
                StudentPersonalInfo pInfo = new StudentPersonalInfo();
                pInfo.setBatch("13");
                pInfo.setRollNum("13_CS_19");
                pInfo.setName("imtiaz");
                pInfo.setCnic("44205-82187913");
                pInfo.setFatherName("Sobdar wassan");
                pInfo.setFtContactNum( "+923333945719");
                pInfo.setStContactNum("+923002639694");
                pInfo.setGender("Male");
                pInfo.setCaste("wassan");
                pInfo.setTempAdd("Mallir cantt karachi");
                pInfo.setPermAdd("Village Gujh Heran Taulka Sinjhoro District Sanghar");
                pInfo.setStEmail("wassanimtiaz@outlook.com");
                pInfo.setPassword("pakistan");
                pInfo.setBatch("13");
                //Master table object
                Master m = new Master();
                m.setDepart("civil");
                m.setMasterKey("civil");
                
//                Master m = new Master();
//                m.setDepart("Computer");
//                m.setMasterKey("imtiaz");
                try{
                    
                Configuration cf = new Configuration();
                cf.configure("xmlFiles/hibernate.cfg.xml");
                SessionFactory sf = cf.buildSessionFactory();
               // SessionFactory sf = HibernateUtil.getSessionFactory();
                Session ses = sf.openSession();
                ses.save(pInfo);
                ses.beginTransaction().commit();
                ses.evict(pInfo);
                
                
               // ses = sf.openSession();
//                ses.save(pInfo);
//                ses.beginTransaction().commit();
                pInfo = (StudentPersonalInfo)ses.get(StudentPersonalInfo.class, "13_CS_19");
                System.out.println(pInfo.getRollNum());
                System.out.println(pInfo.getName());
               
//                ses.evict(m);
//                ses.close(); 
                
                m = (Master)ses.get(Master.class, "cs");
                System.out.println(m.getDepart());
                System.out.println(m.getMasterKey());
//                ses = sf.openSession();
//                ses.save(db);
//                ses.beginTransaction().commit();
//                ses.evict(db);
//                ses.close();
               // ses = sf.openSession();
               // m = (Student)ses.get(Student.class, 1);
               // System.out.println("Name="+m.getName());
//                System.out.println("Id="+m.getId());
                
                ses.close();
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
}

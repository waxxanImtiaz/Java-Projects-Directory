/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingxmlfile;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author waxxan
 */

public class  ReadingXmlFile {
            
            public static void main( String[] args )
            {
                //DepartAndBatches table object
//                DepartAndBatches db = new DepartAndBatches();
////                db.setDepart("CS");
////                db.setBatch("17");
////                
//                //StudetPersonalInfo table object
//                StudentPersonalInfo pInfo = new StudentPersonalInfo();
//                pInfo.setBatch("13");
//                pInfo.setRollNum("13_CS_19");
//                pInfo.setName("imtiaz");
//                pInfo.setCnic("44205-82187913");
//                pInfo.setFatherName("Sobdar wassan");
//                pInfo.setFtContactNum( "+923333945719");
//                pInfo.setStContactNum("+923002639694");
//                pInfo.setGender("Male");
//                pInfo.setCaste("wassan");
//                pInfo.setTempAdd("Mallir cantt karachi");
//                pInfo.setPermAdd("Village Gujh Heran Taulka Sinjhoro District Sanghar");
//                pInfo.setStEmail("wassanimtiaz@outlook.com");
//                pInfo.setPassword("pakistan");
//                pInfo.setBatch("13");
                //Master table object
               // Master m = new Master();
//                m.setDepart("civil");
//                m.setMasterKey("civil");
//                
//                Master m = new Master();
//                m.setDepart("Computer");
//                m.setMasterKey("imtiaz");
                try{
                    
//                Configuration cf = new Configuration();
//                cf.configure("xmlFiles/hibernate.cfg.xml");
//                SessionFactory sf = cf.buildSessionFactory();
//               // SessionFactory sf = HibernateUtil.getSessionFactory();
//                Session ses = sf.openSession();
//                ses.save(pInfo);
//                ses.beginTransaction().commit();
//                ses.evict(pInfo);
                
                
               // ses = sf.openSession();
//                ses.save(pInfo);
//                ses.beginTransaction().commit();
                
//                pInfo = (StudentPersonalInfo)ses.get(StudentPersonalInfo.class, "13_CS_19");
//                System.out.println(pInfo.getRollNum());
//                System.out.println(pInfo.getName());
               
//                ses.evict(m);
//                ses.close(); 
                
                File xmlFile = new File("C:\\Users\\waxxan\\Documents\\NetBeansProjects\\ReadingXmlFile\\src\\readingxmlfile\\StudentPersonalInfo.hbm.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);
                
                NodeList nList = doc.getElementsByTagName("class");
                 System.out.println("Reading");
                    for (int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element)nNode;
                    eElement.setAttribute("table", "cs_14_students");
                    System.out.println("table="+eElement.getAttribute("table"));
                    }
                    else{
                        System.out.println("Error");
                    }
                    }
//                m = (Master)ses.get(Master.class, "cs");
//                System.out.println(m.getDepart());
//                System.out.println(m.getMasterKey());
//                ses = sf.openSession();
//                ses.save(db);
//                ses.beginTransaction().commit();
//                ses.evict(db);
//                ses.close();
               // ses = sf.openSession();
               // m = (Student)ses.get(Student.class, 1);
               // System.out.println("Name="+m.getName());
//                System.out.println("Id="+m.getId());
                
                //ses.close();
                }catch(ParserConfigurationException e)
                {
                    e.printStackTrace();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
}

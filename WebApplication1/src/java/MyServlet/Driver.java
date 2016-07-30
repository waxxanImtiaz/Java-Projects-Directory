/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyServlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author waxxan
 */
public class Driver {
    public static void main(String[] args) {
        Student s = new Student();
                
                s.setId(1);
                s.setName("imtiaz");

                Configuration cf = new Configuration();
                cf.configure("controller/hibernate.cfg.xml");
                
                SessionFactory sf = cf.buildSessionFactory();
                Session ses = sf.openSession();
                
                ses.save(s);
                ses.beginTransaction().commit();
                ses.evict(s);
    }
}

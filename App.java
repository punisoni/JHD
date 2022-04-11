package com.JHD;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Emp1;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tf = session.beginTransaction();
        
        Emp1 e = new Emp1();
        Emp1 e1 = new Emp1();
        Emp1 e2 = new Emp1();

        
        e.setSalary(1);
        e.setName("poonam");
        e.setEmail("pooanm@gmail.com");
        
        e1.setSalary(2);
        e1.setName("supriya");
        e1.setEmail("supriya@gmail.com");
        
        e2.setSalary(3);
        e2.setName("teju");
        e2.setEmail("teju@gmail.com");
        
        
        session.saveOrUpdate(e);
        session.saveOrUpdate(e1);
        session.saveOrUpdate(e2);
        
        
       session.delete(e2);
        tf.commit();
    }
}




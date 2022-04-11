package com.JHD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.entity.Mapping;
import com.entity.Person;

public class Mappinga {
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
      Transaction tf = session.beginTransaction();
      
      
      
      Person person = new Person();
      person.setpid(123);
      person.setpname("manisha");
      
      Mapping mapping = new Mapping();
      mapping.setAccountNo(44444);
      mapping.setAccountType("Saving_accuont");
      mapping.setPerson(person);
      person.setMapping(mapping);
      
      session.saveOrUpdate(person);
      session.saveOrUpdate(mapping);
      tf.commit();
    }
}

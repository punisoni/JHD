package com.JHD;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Emp2;
import com.entity.Project;



public class MappingMTM 
{

	

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tf = session.beginTransaction();
      
      
      
      
	Emp2 e1= new Emp2();
    Emp2 e2 = new Emp2();
      
      e1.setEid(24);
      e1.setName("soni");
      e2.setEid(25);
      e2.setName("sanju");
      
      Project p1=new Project();
      Project p2=new Project();
      
      p1.setPid(6772);
      p1.setProjectName("School management system");
      p2.setPid(6779);
      p2.setProjectName("student database management system");
      
      List<Emp2>list1=new ArrayList<Emp2>();
      List<Project>list2=new ArrayList<Project>();

      list1.add(e1);
      list1.add(e2);
      
      list2.add(p1);
      list2.add(p2);

      e1.setProjects(list2);
      e2.setProjects(list2);
      p2.setEmps(list1);
      p1.setEmps(list1);
      
      
      
      session.saveOrUpdate(e1);
      session.saveOrUpdate(e2);
      session.saveOrUpdate(p1);
      session.saveOrUpdate(p2);
      
      tf.commit();
      session.close();
      
      
    }
}

	

	

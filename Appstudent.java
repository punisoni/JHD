package com.JHD;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Emp1;
import com.entity.Student1;

public class Appstudent 
{

    

	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
      Transaction tf = session.beginTransaction();
        /*String hqll="from Student1";
     Query<Student1> q=session.createQuery(hqll);
       List<Student1>list= q.list();
       for(int i=0;i<list.size();i++)
       {
        	//System.out.println(list.get(i));
      }*/
      
      //**** using Scanner***// 
      
     /* Scanner sc=new Scanner(System.in);
        System.out.println("enter roll to search:");
        int sturoll1=sc.nextInt();
        System.out.println("enter name to search:");
        sc.nextLine();
        String sname=sc.nextLine();
        System.out.println("enter email to search:");
        sc.nextLine();
        String semail=sc.nextLine();

        String hql1="from Student1 s where s.roll=?0 and s.name=?1 and s.email=?2";
        Query <Student1>query=session.createQuery(hql1);
        query.setInteger(0, sturoll1);
        query.setParameter(1, sname);
        query.setParameter(2, semail);

        
        List<Student1>list=query.list();
        for(int i=0;i<list.size();i++)
        {
        
        System.out.println(list.get(i));
        
        }/*
        
      //*** without scanner***///
        /*String hql1="from Student1 s where s.roll=?0 and s.name=?1";
        Query <Student1>query=session.createQuery(hql1);
        query.setInteger(0,12 );
        query.setParameter(1, "poonam");
        
        List<Student1>list1=query.list();
        for(int i=0;i<list1.size();i++)
        {
        
        System.out.println(list1.get(i));
        }*/
   //   ***  update operation  query with scanner ***  //
        
   Scanner sc = new Scanner(System.in);
        System.out.println("enter the student roll number which you want to update");
        int rollno=sc.nextInt();
        System.out.println("enter the student name which you want to update");
        sc.nextLine();
        String sname=sc.nextLine();
        
        
        String hql="update Student1 set name=:stu_name where roll=:stu_roll";
        Query<Student1>query = session.createQuery(hql);
        query.setParameter("stu_roll",rollno);
        query.setParameter("stu_name",sname);

        int i = query.executeUpdate();
        if(i>0)
        {
        	System.out.println("Record is updated");
        	tf.commit();
         }
       else
        {
        	System.out.println("Record is not updated");
        }
        
     //*** Delete query operation using scanner ***//
     
      /*Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Student roll number which you want to Delete");
      int rollno=sc.nextInt();
      String hql ="delete from Student1 s where s.roll=?0";
      Query<Student1> query = session.createQuery(hql);
      query.setParameter(0, rollno);
      int i = query.executeUpdate();
      if(i>0)
      {
    	  System.out.println("Record is Deleted");
    	  tf.commit();
    }
      else
      {
    	  System.out.println("Record is not Deleted");
      }*/
  
   Student1 s = new Student1();
    Student1 s1 = new Student1();
    Student1 s2 = new Student1();
    Student1 s3 = new Student1();

    s.setRoll(10);
    s.setName("poonam");
    s.setEmail("pooanm@gmail.com");
    
    s1.setRoll(11);
    s1.setName("rahel");
    s1.setEmail("rahel@gmail.com");
    
    s2.setRoll(12);
    s2.setName("supriya");
    s2.setEmail("supriya@gmail.com");
    
    s3.setRoll(13);
    s3.setName("teju");
    s3.setEmail("teju@gmail.com");
    
    
    session.saveOrUpdate(s);
    session.saveOrUpdate(s1);
    session.saveOrUpdate(s2);
    session.saveOrUpdate(s3);

    tf.commit();
   
    
    
  }
}
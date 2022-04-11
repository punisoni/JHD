package com.JHD;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Answer;
import com.entity.Question;

public class mainAQ {
	  public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        Configuration config = new Configuration();
	        config.configure("hibernate.cfg.xml");
	        SessionFactory sf = config.buildSessionFactory();
	        Session session = sf.openSession();
	        Transaction tf = session.beginTransaction();
  
	   //CQ
	        Question q1 = new Question();
	        q1.setQuesId(101);
	        q1.setQues("which are the oops concept in java ?");
	        
	        //CA
	        Answer answer = new Answer();
	        answer.setAnsId(10);
	        answer.setAns("inheritance");
	        answer.setQuetion(q1);
	        
	        Answer answer2 = new Answer();
	        answer.setAnsId(11);
	        answer.setAns("encapsulation");
	        answer.setQuetion(q1);
	        
	        
	        Answer answer3 = new Answer();
	        answer.setAnsId(12);
	        answer.setAns("polymorphism");
	        answer.setQuetion(q1);
	        
	        List<Answer>list = new ArrayList<Answer>();
	        list.add(answer);
	        list.add(answer2);
	        list.add(answer3);
	        
	        q1.setAnswer(list);
	        
	        
	        session.save(q1);
	        session.saveOrUpdate(answer);
	        session.saveOrUpdate(answer2);
	        session.saveOrUpdate(answer3);
	       
	        
	        tf.commit();
	        session.close();
	    
	    }
}
package com.JHD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.GetLoad;



public class Getload {

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tf = session.beginTransaction();
        
  //1.using get method.
    
       // GetLoad obj = session.get(GetLoad.class,1);
      // System.out.println(obj);
       // System.out.println(obj.getRoll()+"\t"+obj.getName());
        
        
  //2.using load method.
        
      GetLoad obj = session.load(GetLoad.class,4);
       System.out.println(obj);
     //   System.out.println(obj.getRoll()+"\t"+obj.getName());
        
        
      GetLoad d =new GetLoad();
       GetLoad d1 =new GetLoad();
      
     d.setRoll(20);
      d.setName("pooja");
      
     d1.setRoll(30);
     d1.setName("pari");
      
     session.saveOrUpdate(d);
     session.saveOrUpdate(d1);

      tf.commit();

}
}
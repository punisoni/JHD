package CriteriaApi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Criteriamain
{

	

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();	
        Transaction tf = session.beginTransaction();

        /////GT/////
        Criteria c = session.createCriteria(employee.class);
        System.out.println("greater than salary :");
        c.add(Restrictions.gt("salary",5000));
        List list = c.list();
        
        for(int i =0;i < list.size();i++)
        {
        	System.out.println(list.get(i));
        }
       ////LT/// 
        Criteria c1 = session.createCriteria(employee.class);
        System.out.println("less than salary :");
        c1.add(Restrictions.lt("salary",1200));
        List list1 = c1.list();
        
        for(int i =0;i < list1.size();i++)
        {
        	System.out.println(list1.get(i));
        	
        }  
        //LTE//
        Criteria c2= session.createCriteria(employee.class);
        System.out.println("less than salary :");
        c2.add(Restrictions.lt("salary",1200));
        List list2 = c2.list();
        
        for(int i =0;i < list2.size();i++)
        {
        	System.out.println(list2.get(i));
        	
        }  
       //not equal//
        Criteria c3= session.createCriteria(employee.class);
        System.out.println("salary is not equal to 5000");
        c3.add(Restrictions.ne("salary",5000));
        List list3 = c3.list();
        
        for(int i =0;i < list3.size();i++)
        {
        	System.out.println(list3.get(i));
        }
        //between//
        Criteria c4= session.createCriteria(employee.class);
        System.out.println(" salary between 2000 to 5000 :");
        c4.add(Restrictions.between("salary",2000,5000));
        List list4 = c4.list();
        
        for(int i =0;i < list4.size();i++)
        {
        	System.out.println(list4.get(i));
        }
        //like//
        Criteria c5 = session.createCriteria(employee.class);
        System.out.println("salary is like 5000 :");
        c5.add(Restrictions.like("salary",5000));
        List list5 = c5.list();
        
        for(int i =0;i < list5.size();i++)
        {
        	System.out.println(list5.get(i));
        }
        //...using order class sorting ascending..//
        Criteria c6 = session.createCriteria(employee.class);
        System.out.println("salary is in Acending order :");
        c6.addOrder(Order.asc("salary"));
        List list6 = c6.list();
        
        for(int i =0;i < list6.size();i++)
        {
        	System.out.println(list6.get(i));
        }
        //...using order class sorting descending....//
        Criteria c7= session.createCriteria(employee.class);
        System.out.println("salary is in descending 5000 :");
        c5.addOrder(Order.desc("salary"));
        List list7 = c7.list();
        
        for(int i =0;i < list7.size();i++)
        {
        	System.out.println(list7.get(i));
        }
    
        	//...........using projection class performs  aggregate .........//
        	
        	Criteria c8 = session.createCriteria(employee.class);
        	c8.setProjection(Projections.rowCount());
        	List list8 = c8.list();
        	System.out.println("Row Count is : "+list8);
        	

        	Criteria c9 = session.createCriteria(employee.class);
        	c9.setProjection(Projections.avg("salary"));
        	List list9 = c9.list();
        	System.out.println("Average is : "+list9);
        	

        	Criteria c10 = session.createCriteria(employee.class);
        	c10.setProjection(Projections.max("salary"));
        	List list10 = c10.list();
        	System.out.println("Maximum is : "+list10);
        	

        	Criteria c11 = session.createCriteria(employee.class);
        	c11.setProjection(Projections.min("salary"));
        	List list11 = c11.list();
        	System.out.println("minimum is : "+list11);
        	

        	Criteria c12 = session.createCriteria(employee.class);
        	c12.setProjection(Projections.rowCount());
        	List list12 = c12.list();
        	System.out.println("Distinct Count is : "+list12);
        	
        	
        	  /*employee obj1=new employee();obj1.setId(11);obj1.setName("poonam1");
        	  obj1.setSalary(8000);
        	  
        	 employee obj2=new employee();obj2.setId(22);obj2.setName("pooja2");
        	  obj2.setSalary(9000);
        	  
        	  employee obj3=new employee();obj3.setId(33);obj3.setName("priya3");
        	 obj3.setSalary(8000);
        	  
             employee obj4=new employee();obj4.setId(44);obj4.setName("priya4");
        	 obj4.setSalary(7000);
        	  
        	 employee obj5=new employee();obj5.setId(55);obj5.setName("soni5");
        	 obj5.setSalary(8000);
        	 
        	 employee obj6=new employee();obj6.setId(66);obj6.setName("dabhade");
        	 obj6.setSalary(9000);
        	 
        	 session.saveOrUpdate(obj1);
        	 session.saveOrUpdate(obj2);
        	 session.saveOrUpdate(obj3);
        	 session.saveOrUpdate(obj4);
        	 session.saveOrUpdate(obj5);
        	 session.saveOrUpdate(obj6);
        	 
        	 tf.commit();
        	 */
        	 
}
}
    



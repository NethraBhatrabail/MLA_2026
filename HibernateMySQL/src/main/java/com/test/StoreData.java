package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
 
public class StoreData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Book obj = new Book();
		
		obj.setB_name("dude");
		obj.setB_author("google");
		obj.setB_price(5);
		
		session.persist(obj);
//		session.remove(obj);
//t.commit();
		
		
		Query<Book> q = session.createQuery("from Book");
		List<Book> list = q.list();
		for(Book b : list) {
			System.out.println(b.getId()+" "+b.getB_name()+" "+b.getB_author()+" "+b.getB_price());
		}
	//Book dt = session.get(Book.class,252);  //after creating the table, here you mention one id and that will be removed using session.remove(dt); 
//	System.out.println(dt.getId()+" "+dt.getB_name()+" "+dt.getB_author()+" "+dt.getB_price());
//	
//	dt.setB_name("HTML");
//	dt.setB_author("Krutji");
//	dt.setB_price(10);
//	session.persist(obj);	
//session.remove(obj);
//	session.remove(dt);
	t.commit();
		System.out.println("Done.");
		
	}

}

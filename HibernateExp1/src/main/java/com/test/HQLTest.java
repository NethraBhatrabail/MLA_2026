package com.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class HQLTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		//String hql="select c.c_name, c.c_city from Customer1 c";
		String hql1 = "delete from Customer1 where c_id = :id";
		Query q = session.createQuery(hql1);
		q.setParameter("id", 1);  //this is to delete id 1 , you have to mention which id you want to remove from table
		int row = q.executeUpdate();
		t.commit();
		String hql = "from Customer1";
		
		
		Query<Customer1> dt = session.createQuery(hql);
		List<Customer1> list = dt.getResultList();
		System.out.println("HQL Result" +list);
		
		session.close();
	
		
	}

}

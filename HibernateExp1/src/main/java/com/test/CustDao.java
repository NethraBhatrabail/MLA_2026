package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class CustDao {
	public static Session getDBSession()
	{
		Session session = null;
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
			session = sf.openSession();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return session;
	}

	public void saveCustomer(Customer1 cst)
	{
		Session session = CustDao.getDBSession();
		Transaction t = session.beginTransaction();
		session.persist(cst);
		//CustDao.getDBSession().persist(cst);
		t.commit();
		CustDao.getDBSession().close();
	}
	
	public List<Customer1>getAllCustomers()
	{
		Session session = CustDao.getDBSession();
		//List<Customer1> list = new ArrayList<>();
		Query<Customer1> q = session.createQuery("from Customer1");
		List<Customer1> list = q.list();
		return list;
		
	}
	
	public void updateCustomer(Customer1 cst) {
		Session session = CustDao.getDBSession();
		Transaction t = session.beginTransaction();
		Customer1 obj = session.find(Customer1.class, cst.getC_id());
		obj.setC_name(cst.getC_name());
		obj.setC_city(cst.getC_city());
		
		session.persist(obj);
		
		t.commit();
		session.close();
		
	}
	
	
	public void deleteCustomer(Customer1 cst) {
		Session session = CustDao.getDBSession();
		session.remove(cst);
		session.beginTransaction().commit();
		session.close();
		
	}
	
	
}

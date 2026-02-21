package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Address adr = new Address();
		adr.setCity("Mangaluru");
		adr.setState("Karnataka");
		Employee emp = new Employee();
		emp.setE_name("Nethra");
		emp.setE_cmp("xxx");
		emp.setAdress(adr);
		adr.setEmployee(emp);
		
		session.persist(emp);
		t.commit();
		session.close();
		
	}

}

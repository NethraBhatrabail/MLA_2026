package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class CriteriaTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Customer1> cq = cb.createQuery(Customer1.class);
		cq.distinct(true);
		Root<Customer1> rt = cq.from(Customer1.class);
		cq.select(rt);
		TypedQuery<Customer1> tq = session.createQuery(cq);
		List<Customer1> list = tq.getResultList();
		System.out.println(list);
		
		
		
	}

}

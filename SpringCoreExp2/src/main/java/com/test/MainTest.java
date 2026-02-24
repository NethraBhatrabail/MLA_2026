package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		//Customer obj = ctx.getBean("cst1", Customer.class);
		//System.out.println(obj);
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
		Address aobj = ctx.getBean(Address.class);
		
		aobj.setCity("Tirupati");
		aobj.setState("Ap");
		aobj.setCountry("India");
		Customer cst = ctx.getBean(Customer.class);
		
		cst.setId(1122);
		cst.setName("Nethra");
		cst.setAdr(aobj);
		
		System.out.println(cst);
	}

}

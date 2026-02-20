package com.test;

import java.util.List;

public class CustDemo {
	public static void main(String[] args) {
		CustDao cdao = new CustDao();
		Customer1 cst = new Customer1();
		//cst.setC_id(2);       //comment for saving  (uncomment for update mode
		cst.setC_name("SamsungStar");
		cst.setC_city("Pune");
		
		cst.setC_name("Sky");
		cst.setC_city("Ban");
		
		//cdao.deleteCustomer(cst);     //for deleting the attributes in the table 
		cdao.saveCustomer(cst);    //uncomment for saving
		//cdao.updateCustomer(cst);   //uncomment for update 
		List<Customer1> list = cdao.getAllCustomers();       //uncomment for saving mode
		list.forEach(System.out::println);    //uncomment for saving mode
	}

}

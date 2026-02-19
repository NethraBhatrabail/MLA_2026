package com.test;

public class TestDemo {
	public static void main(String[] args) {
		
		EmpDao edao = new EmpDao();
		
		Employee1 emp1 = new Employee1();
		
		emp1.setId(1);
		emp1.setName("Rohit");
		emp1.setCmp("Dell");
		emp1.setCity("Bangalore");
		
		edao.saveEmployee(emp1);
		
		System.out.println("Saved Employee Data.");
	}

}

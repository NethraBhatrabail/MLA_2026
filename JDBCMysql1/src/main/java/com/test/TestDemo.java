package com.test;

import java.util.List;

public class TestDemo {
	public static void main(String[] args) {
		
		EmpDao edao = new EmpDao();
		
		Employee1 emp1 = new Employee1();
		
		emp1.setId(2);
		emp1.setName("nethra");
		emp1.setCmp("google");
		emp1.setCity("Delhi");
		
		
		
		//edao.saveEmployee(emp1);
		edao.updateEmployee(emp1);
		
		System.out.println("Saved Employee Data.");
		List<Employee1> data = edao.getAllEmployees();
		data.forEach(System.out::println);
		
		
	}

}

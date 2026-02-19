package com.test;

import java.util.List;

public class StuTestDemo {
    public static void main(String[] args) {
		
		StudentDao edao = new StudentDao();
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		stu1.setUsn(1);
		stu1.setName("sandhya");
		stu1.setCollege("sdpt");
		stu1.setCity("Vitla");
		stu1.setCgpa(9);
		
		stu2.setUsn(2);
		stu2.setName("prasanna");
		stu2.setCollege("nethra");
		stu2.setCity("Vitla");
		stu2.setCgpa(9);
		
		
		
		//edao.saveStudent(stu2);
		edao.updateStudent(stu2);
		
		System.out.println("Saved Student Data.");
		List<Student> data = edao.getAllStudents();
		data.forEach(System.out::println);
		
		
	}

}

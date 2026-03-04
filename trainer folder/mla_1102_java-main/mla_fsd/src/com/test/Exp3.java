package com.test;

@FunctionalInterface
interface FunInf1
{
	String greetUser(String  name, String msg);
}

public class Exp3 {
	
	public void show()
	{
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		
		FunInf1 obj1 = (String name, String msg) ->
		{
			System.out.println("Hi "+name+" "+msg);
			
			return "Hello "+name+" MLA "+msg;
		};
		
		System.out.println(obj1.greetUser("Rohit", " Welcome to FSD MetaGeek Coders..."));
		
		Exp3 obj5 = new Exp3();
		
		int x = 200;
		
		Integer xx = x;
		
		
		
		
	}
}

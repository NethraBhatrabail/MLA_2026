package com.test.cls;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Exp3 {
	
	public static void main(String[] args) {
		
		//HashSet data = new HashSet();
		
		//LinkedHashSet data = new LinkedHashSet();
		
		TreeSet<String> data = new TreeSet<>();
		
		data.add("python");
		data.add("kotlin");
		data.add("go lang");
		data.add("groovy");
		data.add("java");
		data.add("test");
		data.add("php");
		data.add("html");
		data.add("java");
		data.add("service now");
		
		System.out.println(data.size());
		
		System.out.println(data);
		
		/*
		Iterator itr = data.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		*/
		data.forEach(System.out::println);
	}
}

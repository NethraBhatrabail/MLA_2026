package com.test.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;

public class EmployeeAfterAspect {
	
	@After("args(name)")
	public void logStringArguments(String name) 
	{
		System.out.println("Running after advice String arguments passed");
	}
	
	@AfterThrowing("within(com.test.model.Employee")
	public void logException(JoinPoint joinPoint) 
	{
		System.out.println("exception thrown in employee method "+joinPoint.toString());
	}
	
	@AfterReturning(pointcut = "execution(* getName())", returning ="returnString")
	public void getNameReturningSdvice(String returnString) 
	{
		System.out.println("getNameReturningAdvice executed Returning string "+returnString);
	}

}

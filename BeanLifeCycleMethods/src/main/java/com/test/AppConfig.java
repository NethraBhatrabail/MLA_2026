package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.test")

public class AppConfig {
	
	private final ConnectionManager connectionManager;
	AppConfig(ConnectionManager connectionManager){
		this.connectionManager= connectionManager;
	}
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		ConnectionManager manager = ctx.getBean(ConnectionManager.class);
		manager.operation();
		ctx.close();
	}
	

}

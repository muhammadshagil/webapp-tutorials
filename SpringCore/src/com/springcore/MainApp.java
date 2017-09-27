package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.support.CallbackPreferringPlatformTransactionManager;

public class MainApp {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld helloWorldA = (HelloWorld) applicationContext.getBean("helloWorld");
//		System.out.println(helloWorldA.getMessage());
		
//		helloWorldA.setMessage("I am Object A");
//		
//		HelloWorld helloWorldB = (HelloWorld) applicationContext.getBean("helloWorld");
//		
//		System.out.println(helloWorldB.getMessage());
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld helloWorldA = (HelloWorld) context.getBean("helloWorld");
//		System.out.println(helloWorldA.getMessage1());
//		
//		HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
//		System.out.println("message 1 : "+helloIndia.getMessage1()+" & message2 : "+helloIndia.getMessage2());
//		
//		JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollection");
//		System.out.println(javaCollection.getAddressList());
//		System.out.println(javaCollection.getAddressSet());
//		System.out.println(javaCollection.getAddressMap());
//		System.out.println(javaCollection.getAddressProperties());
		
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		JdbcTemplateDAO jdbcTemplateDAO = (JdbcTemplateDAO) applicationContext.getBean("jdbcTemplateDAO");
		Student student = jdbcTemplateDAO.getStudent(2);
		System.out.println("Student name : "+student.getName());
				
	}

}

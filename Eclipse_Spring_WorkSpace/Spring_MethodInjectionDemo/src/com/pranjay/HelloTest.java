package com.pranjay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pranjay/spring-config.xml");
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.printHello();
	}

}

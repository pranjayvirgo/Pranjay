package com.setter.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class GetterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory bf=new XmlBeanFactory(new FileSystemResource("Hello.xml"));
HelloImpl helloService=(HelloImpl)bf.getBean("hello");
helloService.HelloPranjay();
	}

}

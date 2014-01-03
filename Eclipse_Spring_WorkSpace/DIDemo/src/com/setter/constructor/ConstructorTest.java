package com.setter.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.setter.demo.HelloImpl;

public class ConstructorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory bf=new XmlBeanFactory(new FileSystemResource("Constructor.xml"));
HelloImpl helloService=(HelloImpl)bf.getBean("hello");
helloService.HelloPranjay();
	}
}

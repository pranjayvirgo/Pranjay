package com.pranjay;

import org.springframework.beans.factory.annotation.Autowired;

public  class HelloWorld {
	@Autowired
	private StringText text;
public void printHello(){
	/*System.out.println(createStringText());
	createStringText().helloworld();
	System.out.println(createStringText());
	createStringText().helloworld();
	System.out.println(createStringText());
	createStringText().helloworld();
	System.out.println(createStringText());
	createStringText().helloworld();
	System.out.println(createStringText());
	createStringText().helloworld();*/
	System.out.println(text);
	text.helloworld();
	System.out.println(text);
	System.out.println(text);
	
	
}
/*public abstract StringText createStringText();*/
}

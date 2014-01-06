package com.pranjay;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class SayHelloMethodReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		System.out.println("Method Successfully replaced");
		return null;
	}

}

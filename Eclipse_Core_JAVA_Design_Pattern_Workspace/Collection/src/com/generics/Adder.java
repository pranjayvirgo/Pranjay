package com.generics;

import java.util.Iterator;
import java.util.List;

public class Adder {
public void addAll(List list){
	list.add("hello");
	Iterator it=list.iterator();
	while(it.hasNext()){
		Integer i=(Integer)it.next();
			System.out.println("Inside Add method"+i);
	}
	
}
}

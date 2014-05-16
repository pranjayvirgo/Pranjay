package com.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestAddLegacy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=new ArrayList<Integer>();
list.add(3);
list.add(5);
Adder adder=new Adder();
Iterator<Integer> it=list.iterator();
while(it.hasNext()){
	Integer i=it.next();
		System.out.println("Inside Add method"+i);
}
adder.addAll(list);

	}

}

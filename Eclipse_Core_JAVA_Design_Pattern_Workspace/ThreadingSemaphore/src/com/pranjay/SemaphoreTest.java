package com.pranjay;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SemaphoreTest {
public static void main(String []args){
	 PersonResource p1=new  PersonResource();
	 ExecutorService executor=Executors.newFixedThreadPool(10);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 executor.execute(p1);
	 
	
}
}

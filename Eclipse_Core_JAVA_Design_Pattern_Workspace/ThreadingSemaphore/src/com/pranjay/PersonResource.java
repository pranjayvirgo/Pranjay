package com.pranjay;

import java.util.concurrent.Semaphore;

public class PersonResource implements Runnable{
	Semaphore semaphore=new Semaphore(2,true);
	 static int count=1;
@Override
	public void run(){
		// TODO Auto-generated method stub
try{
	sayHello();
}catch(InterruptedException e){
	e.printStackTrace();
}
	
	
	
	}

public void sayHello() throws InterruptedException{
	semaphore.acquire();
	System.out.println(count++);
	System.out.println(Thread.currentThread().getName());
	Thread.sleep(10000);
	System.out.println("pranjay");
	semaphore.release();
	System.out.println("Thread released succesfuully"+Thread.currentThread().getName());
	}

}

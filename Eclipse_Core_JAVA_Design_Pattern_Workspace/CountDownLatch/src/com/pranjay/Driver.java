package com.pranjay;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class Driver { // ...
	   public static void main(String []args) throws InterruptedException {
	     CountDownLatch doneSignal = new CountDownLatch(10);
	     Executor e = Executors.newFixedThreadPool(10);

	    	     for (int i = 0; i < 10; ++i) // create and start threads
	    	       e.execute(new WorkerRunnable(doneSignal, i));

	    	     doneSignal.await();           // wait for all to finish
	    	     System.out.println("Construction of process completed");
	    	   }
	    	 }
	 
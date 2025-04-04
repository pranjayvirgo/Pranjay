package com.pranjay;

import java.util.concurrent.CountDownLatch;

class Worker implements Runnable {
	   private final CountDownLatch  startSignal;
	   private final CountDownLatch doneSignal;
	   Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
	      this.startSignal = startSignal;
	      this.doneSignal = doneSignal;
	   }
	   public void run() {
	      try {
	        startSignal.await();
	        doWork();
	        doneSignal.countDown();
	      } catch (InterruptedException ex) {} // return;
	   }

	   void doWork() {System.out.println("inside do work"); }
	 }


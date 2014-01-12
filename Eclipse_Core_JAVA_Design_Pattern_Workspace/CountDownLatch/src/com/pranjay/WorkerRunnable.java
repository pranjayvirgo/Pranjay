package com.pranjay;

import java.util.concurrent.CountDownLatch;

class WorkerRunnable implements Runnable {
	private final CountDownLatch doneSignal;
	private final int i;

	WorkerRunnable(CountDownLatch doneSignal, int i) {
		this.doneSignal = doneSignal;
		this.i = i;
	}

	public void run() {
		doWork(i);
		doneSignal.countDown();
	}

	void doWork(int i) {
		System.out.println("Inside do work"+i);
	}
}

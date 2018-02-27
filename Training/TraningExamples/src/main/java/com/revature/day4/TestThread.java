package com.revature.day4;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {

		ExtendedThread t1 = new ExtendedThread("thread1");
		ExtendedThread t2 = new ExtendedThread("thread2");
		//ExtendedThread t3 = new ExtendedThread();
		
		ImplementRunnable t3 = new ImplementRunnable();
		t3.start();
		ImplementRunnable t4 = new ImplementRunnable();
		t4.start();
		
		t1.join();
		t2.join();
		
		t1.start();
		t2.start();
		
		
	}

}

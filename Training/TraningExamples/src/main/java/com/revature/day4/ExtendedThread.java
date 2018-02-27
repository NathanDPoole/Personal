package com.revature.day4;

public class ExtendedThread extends Thread{
	
	String threadName;
	public ExtendedThread(String threadName) {
		this.threadName = threadName;
		System.out.println("constructor: "+this.getState());
	}

	@Override
	public synchronized void run() {
		for (int i=1; i<=20; i++) {
			try {
				Thread.sleep(100);
				System.out.println(this.threadName + ":"+ this.getId()+ ":");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				System.out.println(this.getState());
			}
			
		}
	}
	
}

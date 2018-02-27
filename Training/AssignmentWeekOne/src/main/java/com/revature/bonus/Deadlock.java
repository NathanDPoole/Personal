
package com.revature.bonus;

/**
 * @author Nathan
 * 50
 */
public class Deadlock {

	/**
	 * @param args
	 */
	String str1 = "Hello";
	String str2 = "World";
	
	Thread trd1 = new Thread("Thread 1") {
		public void run() {
			while(true) {
				synchronized(str1){
					synchronized(str2) {
						System.out.println(str1+str2);
					}
				}
			}
		}
	};
	
	Thread trd2 = new Thread("Thread 2") {
		public void run() {
			while(true) {
				synchronized(str2){
					synchronized(str1) {
						System.out.println(str1+str2);
					}
				}
			}
		}
	};
	
	public static void main(String[] args) {

		Deadlock MyDeadlock = new Deadlock();
		MyDeadlock.trd1.start();
		MyDeadlock.trd2.start();
	}
	
	/*
	 * first you start trd1 an it takes control of str1
	 * then you start tre2 and it takes control of str2
	 * then trd1 tries to take control of str2 but can't because trd2 already has it
	 * but trd2 will never relinquish it because it is waiting for trd1 to give up 
	 * 		str1.
	 * in conclusion, both are waiting on each other so neither can go.
	 */

}

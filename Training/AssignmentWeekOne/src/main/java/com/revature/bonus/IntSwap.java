package com.revature.bonus;

/**
 * @author Nathan
 * 46.	Write a method that swaps two integer variables without using a third 
 * 		variable.
 */

public class IntSwap {

	private static int a= 5, b =10;
	
	public static void main(String[] args) {
		System.out.println("a: "+a);
		System.out.println("b: "+b);

		intSwap();
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

	private static void intSwap() {

		 a = a + b;
		 b = a - b;
		 a = a - b;
	}
}

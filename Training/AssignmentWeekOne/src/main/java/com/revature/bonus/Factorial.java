package com.revature.bonus;

/**
 * @author Nathan
 * 48.	Write a Java application that computes the factorial of a number.
 */

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}

	private static int factorial(int fact) {

		for(int i = fact-1; i>0; i--) {
			fact *= i;
		}
		return fact;
	}
}

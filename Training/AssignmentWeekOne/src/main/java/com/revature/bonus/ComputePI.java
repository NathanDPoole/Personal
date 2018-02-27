/**
 * 
 */
package com.revature.bonus;

/**
 * @author Nathan
 * 63.	Write a program called ComputePI to compute the value of π. JDK maintains 
 * 		the value of π in a double constant called Math.PI. Compare the values 
 * 		obtained and the Math.PI, in percents of Math.PI.
 */

public class ComputePI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double myPi = computePI(100);
		double comPi = Math.PI;
		double percentError = 100*((myPi-comPi)/comPi);
		System.out.println(myPi);
		System.out.println(comPi);
		System.out.println(percentError);
		
	}

	private static double computePI(int i) {
		double total = 3.0;
		double denom = 2.0;
		for(int j=0;j<i;j++) {
			total += 4/((denom)*(denom+1)*(denom+2));
			denom += 2;
		}
		return total;
	}

}

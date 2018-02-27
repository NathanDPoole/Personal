/**
 * 
 */
package com.revature.bonus;

/**
 * @author Nathan 52
 */

public class ReverseNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(reverseNum(123));
	}

	private static int reverseNum(int i) {
		int total = 0, dig;
		while(i >0) {
			dig = i%10;
			i /= 10;
			//System.out.println(i);
			total *= 10;
			total += dig;
		}
		return total;
	}

}

/**
 * 
 */
package com.revature.bonus;

/**
 * @author Nathan
 * 53.	Find a duplicate number from an array of 1 to N numbers.
 */
public class FindDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] myInts = {1, 2, 3, 4, 5};
		System.out.println((int)findDuplicate(myInts));
	}

	private static int findDuplicate(int[] myInts) {

		for(int i=0; i<myInts.length;i++) {
			//System.out.println("i: "+i);
			for(int j = i+1; j<myInts.length; j++) {
				//System.out.println("  j: "+j);
				if( i == myInts[j]) return i;
			}
		}
		System.out.print("No duplicates found ");
		return 0;
	}

}

package com.revature.bonus;

/**
 * @author Nathan
 * 47.	Create a Java application that finds the middle node of a LinkedList in 
 * 		one pass.
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> test = new LinkedList<>();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		System.out.println(test.get(findMiddle(test)));
	}
	
	public static int findMiddle(LinkedList<Integer> l) {
		int index = -1;
		Iterator<Integer> accendtwice = l.iterator();
		
		while(accendtwice.hasNext()) {
			index++;
			accendtwice.next();
			if(accendtwice.hasNext()) accendtwice.next();
		}
		return index;
	}

}

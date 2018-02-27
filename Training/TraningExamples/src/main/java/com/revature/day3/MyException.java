package com.revature.day3;

public class MyException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String GetMessage() {
		return "This is an intentional exception";
	}
}

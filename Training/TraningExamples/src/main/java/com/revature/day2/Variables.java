package com.revature.day2;

public class Variables {
	int a;
	short s;
	long l;
	double d;
	char c;
	float f;
	byte by;
	boolean b;
	
	public static void main(String[] args) {
		
//		new Variables().printVaribles();
		Variables v1 = new Variables();
		v1.printVariables();
		v1.localVAribales();
		
	}
	
	void printVariables() {
		System.out.println("value of a"+a);
		System.out.println("value of s"+s);
		System.out.println("value of l"+l);
		System.out.println("value of d"+d);
		System.out.println("value of c"+c);
		System.out.println("value of f"+f);
		System.out.println("value of by"+by);
		System.out.println("value of b"+b);

	}
	
	void localVAribales() {
		int x=10, y=20;
		System.out.println("value of x"+x);
		System.out.printf("value of y %d",y);
	}
}
package com.revature.parts;

public class CarPart implements partFunction {

	int durablility = 100;
	
	public void status() {
		System.out.println("The part's durability is: "+durablility);
	}

	@Override
	public void function() {
		System.out.println("Part's function is generic");
	}
}

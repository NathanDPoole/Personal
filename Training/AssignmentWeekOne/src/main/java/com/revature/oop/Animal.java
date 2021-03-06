package com.revature.oop;

/*
 * Nathan Poole
 * Question Nine
 * Create an Animal interface with two methods: 
 * 		eat() and move().
 *  
 * Write a class called Mammal that implements Animal and the eat() 
 * 		but does not implement move(). Mammal should also have a 
 * 		static method called walk().
 *  
 * Create a Human class that extends Mammal, overrides eat() and 
 * 		has a static method called walk(). 
 * 
 * Create two objects as follows:
 * 		Animal one = new Human(); 	
 * 		Mammal two = new Human(); 	
 * 		Human three = new Human();
 * 
 * Call each of the methods for each of the objects: 
 * 		eat(), move(), walk(). 
 * 		Note the results.
 */

public interface Animal {
	
	public void eat();	
	public void move();
		
}

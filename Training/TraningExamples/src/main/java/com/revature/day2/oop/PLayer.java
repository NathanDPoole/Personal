package com.revature.day2.oop;

public class PLayer {
	public PLayer() {
		System.out.println("New player Constructed");
	}
	
	public void run() {
		System.out.println("Player can run");
	}
	
	public void fetch() {
		System.out.println("Player can try to fetch");
	}
	
	public void jump() {
		System.out.println("Player can jump");
	}
	
	public void jump(int x) {
		System.out.println("Player can jump "+x+" inches.");
	}
	
	public void jump(int x, int y) {
		System.out.println(x+"players can jump "+y+" inches.");
	}
	
	public void jump(int x, float y) {
		System.out.println(x+"players can jump "+y+" inches.");
	}
	
	public void jump(float x, int y) {
		System.out.println(y+"players can jump "+x+" inches.");
	}
}

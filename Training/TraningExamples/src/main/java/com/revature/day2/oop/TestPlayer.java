package com.revature.day2.oop;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestPlayer {
	
	
	PLayer p1 = new PLayer();

	@Before
	public void setUp() throws Exception {
		System.out.println("set up - Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tear down - After");
	}
	
	@Ignore
	@Test
	public void testRun() {
		p1.run();
	}

	//@Ignore
	@Test
	public void testFetch() {
		p1.fetch();
	}
	
	//@Ignore
	@Test
	public void testJump() {
		p1.jump();
	}

}

package com.revature.day3;

import java.util.StringTokenizer;

import org.apache.log4j.Logger;

public class StringExample {
	
	final static Logger logger = Logger.getLogger(Logger.class);
	public static void main(String[] args) {
		//stringExample();
		//performanceCheck();
		//moreFunWithStrings();
		tokenExample();
	}

	static void stringExample() {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		if(s1 == s2) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}
		if(s2 == s3) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}
		
		if(s1.equals(s2)||s2.equals(s3)) {
			if(s1.equals(s2)) {
				System.out.println("s1 = s2");
			} else {
				System.out.println("s1 != s2");
			}
			if(s2.equals(s3)) {
				System.out.println("s2 = s3");
			} else {
				System.out.println("s2 != s3");
			}
			if(s1.equals(s3)) {
				System.out.println("s1 = s3");
			} else {
				System.out.println("s1 != s3");
			}
			
		}
		
		
		long starttime = System.nanoTime();
				
		for(int i=0; i<10000; i++) {
					String s5 = "a;ldkjf;alskjdf;laksjdfla;skjd;flaksjd;flkajsd;flkjas;dlfkja;sldkjf;alskjd;flakjsd;flkja;sldkjf;dlkjf;doiwuq;lekvnfiodjsncpaiejm;fqxiuremnuifauosibnSENrzjuhoniusboevmhrcouf,hvxwempoisb;bvnlvmdhhgoc";

		}
		
		long endtime = System.nanoTime();
		System.out.println(endtime-starttime);
		
	}
	
	public static void performanceCheck() {
		long starttime1 = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
					StringBuffer s6 = new StringBuffer("a;ldkjf;alskjdf;laksjdfla;skjd;flaksjd;flkajsd;flkjas;dlfkja;sldkjf;alskjd;flakjsd;flkja;sldkjf;dlkjf;doiwuq;lekvnfiodjsncpaiejm;fqxiuremnuifauosibnSENrzjuhoniusboevmhrcouf,hvxwempoisb;bvnlvmdhhgoc");
		}
		//System.out.println(s6);
		long endtime1 = System.nanoTime();
		System.out.println(endtime1-starttime1);
		
		long starttime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
					StringBuilder s7 = new StringBuilder("a;ldkjf;alskjdf;laksjdfla;skjd;flaksjd;flkajsd;flkjas;dlfkja;sldkjf;alskjd;flakjsd;flkja;sldkjf;dlkjf;doiwuq;lekvnfiodjsncpaiejm;fqxiuremnuifauosibnSENrzjuhoniusboevmhrcouf,hvxwempoisb;bvnlvmdhhgoc");
		}
		
		long endtime = System.nanoTime();
		System.out.println(endtime-starttime);
	}
	
	public static void moreFunWithStrings() {
		String s8 = " Are we done yet? No this is gonna take for next 10 weeks ";
		System.out.println(s8.length());
		System.out.println(s8.charAt(10));
		System.out.println(s8.substring(10, 20));
		System.out.println(s8.trim());
		System.out.println(s8.concat(" I just got the original string."));
		System.out.println(s8.toUpperCase());
		System.out.println(s8.toLowerCase());
		String[] s9 = s8.split(" ");
		for (String elements: s9) {
			System.out.println(elements);
		}
	}
	
	public static void tokenExample() {
		String s10 = "we learnt the differences between final, finally and finalize. "
				+ "Also we learnt the differences between String, stringBuffer, and StringBuilder.";
		StringTokenizer tokens = new StringTokenizer(s10, " ");
		while(tokens.hasMoreElements()) {
			Object s11 = tokens.nextElement();
			System.out.println(s11);
			logger.info("messing with the string tokenizer" + s11);
		}
	}
}

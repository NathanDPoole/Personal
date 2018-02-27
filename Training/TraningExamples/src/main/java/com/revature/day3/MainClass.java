package com.revature.day3;

import org.apache.log4j.Logger;

public class MainClass {
	
	final static Logger logger = Logger.getLogger(Logger.class);
	public static void main(String[] args )throws MyException, Exception {
		testMyOwnException();
	}
	
	public static void testMyOwnException() throws MyException {
		logger.info("my custom exception");
		throw new MyException();
	}
	
	public void myMethod() {
		try {
			//new ExceptionExample().divideByZero(10, 0);
			new ExceptionExample().printObject();
		}
		catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
			logger.trace(a.getMessage());
			logger.info(a.getMessage());
			logger.warn(a.getMessage());
			logger.fatal(a.getMessage());
		}
		catch(ArithmeticException | ClassCastException ar) {
			System.out.println("Mabye right exception caught");
			System.out.println(ar.getMessage());
			logger.trace(ar.getMessage());
			logger.info(ar.getMessage());
			logger.warn(ar.getMessage());
			logger.fatal(ar.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception Caught!!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
			logger.trace(e.getMessage());
			logger.info(e.getMessage());
			logger.warn(e.getMessage());
			logger.fatal(e.getMessage());
			
		} finally {
			System.out.println("No matter what happens. I always run.");
		}
	}

}

package com.java.exception;

import java.util.Scanner;

public class Finally {
	/*
	 * Java finally block is a block used to execute important code such as closing the connection, etc.
	 */
	
//	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter string");
//		String in = scanner.next();
////		System.out.println("String entered is "+in);
//		//scanner = null;
//		try {
//			// below code do not throw any exception
//			int data = 25 / 5;
//			System.out.println(data + " "+ in);
//		}
//		// catch won't be executed
//		catch (NullPointerException e) {
//			System.out.println(e);
//		}
//		// executed regardless of exception occurred or not
//		finally {
////				if(scanner != null) { // null check
//				scanner.close();
////				}
//			
//			System.out.println("finally block is always executed");
//		}
//
//		System.out.println("rest of the code...");
//	} 
	
	public static void main(String args[]) {

		try {

			System.out.println("Inside the try block");

			// below code throws divide by zero exception
			int data = 25 / 0;
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception
		// can only accept Null Pointer type exception
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println("Parent exception");
		}

		// executes regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of the code...");
	
		} 
}

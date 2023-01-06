package com.java.exception;

public class UserDefinedMain {
	public static void main(String args[]) {
		try {
			// Custom logic
			throw new UserDefinedException("This is user-defined exception");
		} catch (NullPointerException nue) {
			System.out.println("Caught the exception");
			// Print the message from MyException object
			System.out.println(nue.getMessage());
		}
		catch(Exception e) {
			System.out.println("Parent called");
		}
		
	}
}

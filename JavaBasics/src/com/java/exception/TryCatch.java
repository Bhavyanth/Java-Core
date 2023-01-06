package com.java.exception;

public class TryCatch {

	/*
	 * A try block can be followed by one or more catch blocks. Each catch block
	 * must contain a different exception handler. So, if you have to perform
	 * different tasks at the occurrence of different exceptions, use java
	 * multi-catch block.
	 * 
	 * At a time only one exception occurs and at a time only one catch block is
	 * executed. All catch blocks must be ordered from most specific to most
	 * general, i.e. catch for ArithmeticException must come before catch for
	 * Exception.
	 */

//	public static void main(String[] args) {
//		try {
//			int a[] = new int[5];
//			System.out.println(a[10]);
//		} 
//		catch (ArithmeticException e) {
//			System.out.println("Arithmetic Exception occurs");
//		} 
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBounds Exception occurs");
//		}
//		catch (Exception e) {
//			System.out.println("Parent Exception occurs");
//		}
//		System.out.println("rest of the code");
//	}
//	
	public static void main(String[] args) {
		try {
			String fName;
			String lName;
			
			String gender = null;
			if(gender == null) {
				throw new NullPointerException();
			}else {
			System.out.println(gender.length());
			}
			
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} 
		catch(NullPointerException e) {
			System.out.println("Null pointer");
		}
		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
		//
	}
}

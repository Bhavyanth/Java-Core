package com.java.accessModifies;

import com.java.access.PublicEx;

public class PublicMain {
	/*
	 * The public com.java.access modifier is accessible everywhere. It has the widest scope among all other modifiers.
	 */
	
	public static void main(String[] args) {
		PublicEx ex = new PublicEx();
		ex.msg();
	}
	
}

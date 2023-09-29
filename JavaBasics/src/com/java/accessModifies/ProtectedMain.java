package com.java.accessModifies;

import com.java.access.ProtectedEx;

public class ProtectedMain extends ProtectedEx{
	/*
	 * The protected com.java.access modifier is accessible within package and outside the package
	 * but through inheritance only - IS A relationship
	 * 
	 * It provides more accessibility than the default modifer.
	 */
	public static void main(String[] args) {
		ProtectedMain p = new ProtectedMain();
		p.msg();
	}
	
	
	
}

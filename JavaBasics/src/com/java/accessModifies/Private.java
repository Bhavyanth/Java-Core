package com.java.accessModifies;

public class Private {
	private int data = 40;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	private void msg() {
		System.out.println("Hello java");
	}
	
	
}

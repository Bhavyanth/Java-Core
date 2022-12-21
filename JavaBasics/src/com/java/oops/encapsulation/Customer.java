package com.java.oops.encapsulation;

public class Customer {

	private String name;
	private int age;
	private int custId;
	
	private String password;

	// SHIFT + ALT + S -> to generate constructor or getters and setters
	
	public String getName() { // getter
		return name;
	}

	public void setName(String name) { // setter
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getPassword() {
		return password;
	}


}

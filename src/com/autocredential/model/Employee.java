package com.autocredential.model;

public class Employee {
	private String fName;
	private String lName;
	
	public Employee(String firstName, String lastName) {
	    this.fName = firstName;
	    this.lName = lastName;
	}
	
	public String getFirstName() {
	    return fName;
	}
	
	public String getLastName() {
	    return lName;
	}
}
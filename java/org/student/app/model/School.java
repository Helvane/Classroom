package org.student.app.model;

public class School extends State {

	// declare 2 variables
	private String name;
	private String street;
	
	// this constructor has two parameters
	public School(String name, String street) {
		super();
		// initialize variables
		
		this.name = name;
		this.street = street;
	}
	
	// getter function

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
	
	
}

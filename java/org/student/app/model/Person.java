package org.student.app.model;

//implements inherit an interface
public class Person implements House {
	
	private String myname;

	@Override
	public void setName(String name) {
		this.myname = name;
		
	}

	@Override
	public String getName() {
		return this.myname;
	}
	
	
}

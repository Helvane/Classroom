package org.student.app.model;

// extends inherit a class
public class Student extends School {

	private String name2;
	private String street2;
	
	private String url1;
	private String url2;
	
	
	
	public String getUrl1() {
		return url1;
	}

	public void setUrl1(String url1) {
		this.url1 = url1;
	}

	public String getUrl2() {
		return url2;
	}

	public void setUrl2(String url2) {
		this.url2 = url2;
	}

	public Student(String name, String street) {
		// The super pass the value to the parent - in this case it's school
		super(name, street);
		
		this.name2 = "";
		this.street2 = ""; 
	}

	public String getName2() {
		return name2;
	}

	public String getStreet2() {
		return street2;
	}

	public void setName2(String name) {
		this.name2 = name;
	}

	public void setStreet2(String street) {
		this.street2 = street;
	}
	
	

	
	
}

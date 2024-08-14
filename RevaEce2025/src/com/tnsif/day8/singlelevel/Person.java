package com.tnsif.day8.singlelevel;

public class Person {
	
	//Parent class
	
	private String Name;
	private String Address;
	
	//Default Constructor if u use u need to do sy.setName (use setter methods)
	public Person() {
		super();
	}
	
	//Parametrised Constructor
	public Person(String name, String address) {
		super();
		Name = name;
		Address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
}

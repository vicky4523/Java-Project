package com.tnsif.day7;

public class Person {
	
	private String name;
	private String address;
	private long mob;
	
	//Default Constructor
	public Person() {
		System.out.println("Default Constructor");
	}
	
	//Parameterised Constructor
	public Person(String name, String address, long mob) {
		System.out.println("Parametrised Constructor");
		this.name = name;
		this.address = address;
		this.mob = mob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", mob=" + mob + "]";
	}
	
}

package com.tnsif.day8.multilevel;

public class Country {
	private String Name;
	private String Capital;
	public Country() {
		super();
	}
	
	//String name, String capital you copy paste this to State in the parametrised constructor of State
	//Here u don't mention to string method for multilevel
	public Country(String name, String capital) {
		super();
		Name = name;
		Capital = capital;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	
}

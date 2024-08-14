package com.tnsif.day8.multilevel;

public class State extends Country{
	private String State_name;
	private String language;
	public State() {
		super();
	}
	
	//String state_name, String language, String name, String capital 
	//you copy paste this to City in the parametrised constructor of City
	public State(String state_name, String language, String name, String capital) {
		super(name, capital); //pass the variable name of the previous class which has to be accessed
		State_name = state_name;
		this.language = language;
	}
	public String getState_name() {
		return State_name;
	}
	public void setState_name(String state_name) {
		State_name = state_name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "State [State_name=" + State_name + ", language=" + language + ", getName()=" + getName()
				+ ", getCapital()=" + getCapital() + "]";
	}
	

}

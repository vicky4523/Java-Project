package com.tnsif.day8.multilevel;

public class City extends State{
	private String City_name;
	private String Food;
	public City() {
		super();
	}
	public City(String city_name, String food, String state_name, String language, String name, String capital) {
		//pass the variable name of the previous class which has to be accessed
		//along with the parent class
		super(state_name, language, name, capital); 
		City_name = city_name;
		Food = food;
	}
	public String getCity_name() {
		return City_name;
	}
	public void setCity_name(String city_name) {
		City_name = city_name;
	}
	public String getFood() {
		return Food;
	}
	public void setFood(String food) {
		Food = food;
	}
	@Override
	public String toString() {
		return "City [City_name=" + City_name + ", Food=" + Food + ", getState_name()=" + getState_name()
				+ ", getLanguage()=" + getLanguage() + ", getName()=" + getName() + ", getCapital()=" + getCapital()
				+ "]";
	}

}

package com.tnsif.day5;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person per = new Person(); //object creation in java, the Person is class name 
		
		per.setName("Vignesh");
		per.setAddress("Bangalore");
		per.setAge(21);
		per.setGender("Male");
		
		System.out.println(per);

	}

}

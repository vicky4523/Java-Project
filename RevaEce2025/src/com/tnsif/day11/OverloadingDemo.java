package com.tnsif.day11;

//CT Poly
//Overloading is CT
//Overriding is RT

public class OverloadingDemo {

	public static void main(String[] args) {
		//Default 
		ConstructorOverloading c = new ConstructorOverloading();
		System.out.println(c);
		//One parameter
		ConstructorOverloading c1 = new ConstructorOverloading(45.23f);
		System.out.println(c1);
		//Two parameter
	    ConstructorOverloading c2 = new ConstructorOverloading(45.23f, 56.023f);
		System.out.println(c2);
		
		//Method Overloading
		
		System.out.println(Addition.addition(100, 200));
		System.out.println(Addition.addition(20, 45.5f));
		System.out.println(Addition.addition(56.3f, 86.5f));
		
		//Do sysout for other statements

	}

}

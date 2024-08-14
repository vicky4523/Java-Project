package com.tnsif.day7;

//import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p = new Person(); //Default constructor invoked
		p.setName("Vignesh");
		p.setAddress("Bangalore");
		p.setMob(99954236);
		
		System.out.println(p);
		
		//Parametrised Constructor; it does'nt need setter method like default constructor
		
		Person p1 = new Person("Varsha","Bangalore",954632175);
		System.out.println(p1);
		
		//Scanner class
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ente the details");
//		String name,address;
//		long mob;
//		
//		name = sc.nextLine();
//		address = sc.nextLine();
//		mob = sc.nextLong();
//		
//		Person p2 = new Person(name,address,mob);
		
	}

}

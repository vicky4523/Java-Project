package com.tnsif.day8.hierarchical;

public class MainMethod {

	public static void main(String[] args) {
		 Person p;
		 
		 //Here we are adding student() not person()
		 p = new Student("ECE","R21EN179","Vignesh","Bangalore");
		 
		 if(p instanceof Student)//to check if that class has been inherited if you don;t give also no problem
			 System.out.println(p);

	}

}

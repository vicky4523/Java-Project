package com.tnsif.day17;

public class StringLiteralandObject {

	public static void main(String[] args) {
		
		//check diagram in bookf3
		
		String s1 = "hi";//String literal - will be strored in heap memory but in heap memory it's stored in string pool
		String s2 = "hi";
		
		
		String s3 = new String("hi");//String object - will be strored in heap memory 
		
		String s4 = new String(s2);
		
//		System.out.println(s2);//output is hi for both
//		System.out.println(s4);
		
		// == (it won't compare reference values)
		System.out.println("Comparing the two strings " +(s1==s2));
		System.out.println("Comparing the two strings " +(s3==s2));
		System.out.println("Comparing the two strings " +(s4==s2));
		
		// equals (it'll compare reference values)
		System.out.println("Comparing the two strings " +s1.equals(s2));
		System.out.println("Comparing the two strings " +s3.equals(s2));
		System.out.println("Comparing the two strings " +s4.equals(s2));
		
		// compare to (it'll compare ascii values)
		System.out.println("Comparing the two strings " +s1.compareTo(s2));
		System.out.println("Comparing the two strings " +s3.compareTo(s2));
		System.out.println("Comparing the two strings " +s4.compareTo(s2));

	}

}
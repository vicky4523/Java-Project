package com.tnsif.day13;

public class StringOperations {

	public static void main(String[] args) {
		
		String a = new String("  Indian  ");
		String b = a.toUpperCase();
		// Type a. all operations will be dispayed so u can see what ever options are available on strings
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.length());
		System.out.println(a.substring(2, 5));
		System.out.println(b.substring(2));
		System.out.println(a.trim());
		System.out.println(a.strip());
		System.out.println(a.stripTrailing());
		System.out.println(a.isEmpty());
		
		//till here a is indian after this a becomes good morning
		a = "Good Morning";
		System.out.println(a);
	}

}

package com.tnsif.day10;

public class Demo {
	int a = 100;
	static int b = 200;
	static final int c = 300; //is fixed can't be changed 
	
	static void display()
	{
		//System.out.println("A"+a); we cant access members which can't be changed nor accessed in
		// static block
		System.out.println("B Demo "+b);
		
		b = 400;
		System.out.println("updated B Demo "+b);
	}
	static final void display1()
	{
		System.out.println("C Demo "+c);
		
		// c=1000; can't be changed at all coz its final
	}
	
}

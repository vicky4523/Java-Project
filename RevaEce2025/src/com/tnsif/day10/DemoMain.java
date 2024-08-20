package com.tnsif.day10;

public class DemoMain {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.a=150;
		System.out.println(d.a);// value of a is updated to 150
		
		d.display(); // accesing from Demo class
		d.b=250;
		System.out.println("main "+d.b);// value is change donce again
		
		//d.c=350; error
		System.out.println("main "+d.c);
		d.display1();// accesing from Demo class
	}

}

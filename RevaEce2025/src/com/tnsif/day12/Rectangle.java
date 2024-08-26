package com.tnsif.day12;

//Child Class

public class Rectangle extends Shape {
	
	private float l = 4.5f , b = 5.5f;
	@Override
	float calculateArea() {
		
		return l*b;
	}

}

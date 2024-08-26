package com.vignesh.assignment2;

public class CircleMain {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setRadius(5.0f);
		c.setColour("Red");
		
		System.out.println(c);
		System.out.println(c.calcArea(5.0f));

	}

}
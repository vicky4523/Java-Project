package com.vignesh.assignment2;

public class Circle {
	
	float radius;
	String Colour;
	
	double calcArea(float radius)
	{
		double area;
		area = 3.14*radius*radius;
		return area;
	}

	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Colour=" + Colour + "]";
	}
	
}
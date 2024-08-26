package com.tnsif.day12;

public class MainClass {

	public static void main(String[] args) {
		
		//Shape s = new Shape();   can't declare this it'll show error coz there are two different class 
		//rectangle and square
		
		Shape s;
		
		s = new Rectangle();
		s.display();
		System.out.println(s.calculateArea());
		
		s = new Square();
		s.display();
		System.out.println(s.calculateArea());

	}

}

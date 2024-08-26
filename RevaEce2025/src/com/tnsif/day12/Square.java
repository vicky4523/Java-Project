package com.tnsif.day12;

//child class

public class Square extends Shape{//automatically error will come in this line coz its abstract class
	//Start typing the program error will go
	
	private float side = 5.0f;
	@Override
	float calculateArea()
	{
		return side*side;
	}

}

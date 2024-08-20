package com.tnsif.day11;

//CT Poly

public class ConstructorOverloading {
	
	//Real time ex is car model like alto 800 so many colours and fuel types are there but everything
	//has same body so same constructor but different features
	
	private float x;
	private float y;
	//Default constructor
	public ConstructorOverloading() {
		//super();
	}
	//One parameter constructor
	public ConstructorOverloading(float x) {
		super();
		this.x = x;
	}
	//two parameter constructor
	public ConstructorOverloading(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "ConstructorOverloading [x=" + x + ", y=" + y + "]";
	}

}

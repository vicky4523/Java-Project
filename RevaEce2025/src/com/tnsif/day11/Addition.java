package com.tnsif.day11;

//CT Poly

public class Addition {
	
	//Method Overloading - method name should be same but with different datatypes
	// All methods arestatic so don't need to create objects
	
	public static int addition(int a, int b)
	{
		return a+b;
	}
	
	public static float addition(float a, int b)
	{
		return a+b;
	}
	
	public static float addition(int a, float b)
	{
		return a+b;
	}
	
	public static float addition(float a, float b)
	{
		return a+b;
	}
	
	public static String addition(String a, String b)
	{
		return a+b;
	}

}

package com.tnsif.day6.firstpackage;

public class Sample {
	//if you change it to private class sample you cant create objects if you want just try you'll understand
	
	//default public private protected data members
	
	int a = 10;
	public int b = 20;
	private int c = 30;
	protected int d = 40;
	
	//default public private protected member functions
	
	void defaultdisplay()
	{
		System.out.println("Default method");
		System.out.println(a);
	}
	
	public int publicdisplay()   //public is access modifier, int is member function and publicdisplay 
	                             //is the name of the function	
	{
		System.out.println("Public method");
		return b;
	}
	
	private int privatedisplay()   //private is access modifier, int is member function and privatedisplay
	                               //is the name of the function and it is underlined na not to worry it'll come 	
	{
		System.out.println("Private method");
		return c;
	}
	
	protected int protectedisplay()  //protected is access modifier, int is member function and 
	                                 //protectedisplay is the name of the function	
	{
		System.out.println("Protected method");
		return d;
	}

}

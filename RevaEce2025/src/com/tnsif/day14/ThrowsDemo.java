package com.tnsif.day14;

//can't put public class demo it wont accept if u use public u need to declare in a new file
//you need to import IOException for the code to be executed

class demo{ 
	
	void m1()
	{
		System.out.println("No exception");
	}
	
	void m2() throws IOException    //you are mentioning theres a error so u have mentioned so whoever looks 
	//in the file in future knows there is an error
	{
		System.out.println("Device error");
	}
	void m3() throws ArithmeticException
	{
		System.out.println("Arithmetic error");
	}
}

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

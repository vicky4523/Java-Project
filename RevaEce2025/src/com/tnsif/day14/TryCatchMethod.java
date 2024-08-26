package com.tnsif.day14;

public class TryCatchMethod {

	public static void main(String[] args) {
		int a = 40/20;
		System.out.println(a);  //code will get executed
		int b = 20/5;
		System.out.println(b); //code will get executed
		try 
		{
			int c = 10/0;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This block of code will be executed no matter what happens");
			//remove c = 10/0 and put 10 in place of 0 also it'll execute
		}
		int d = 5/5;
		System.out.println(d);   //will not get executed
	}

}

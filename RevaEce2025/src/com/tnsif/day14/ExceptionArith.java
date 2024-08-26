package com.tnsif.day14;
//Arithmetic exception
public class ExceptionArith {

	public static void main(String[] args) {
		int a = 40/20;
		System.out.println(a);  //code will get executed
		int b = 20/5;
		System.out.println(b);  //code will get executed
		int c = 10/0;
		System.out.println(c);   //itll throw exception
		int d = 5/5;
		System.out.println(d);   //will not get executed
	}

}

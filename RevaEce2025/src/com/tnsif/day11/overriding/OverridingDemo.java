package com.tnsif.day11.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		
		//Dynamic Binding is overriding
		
		RBI r;
		
		r = new SBI();
		System.out.println(r.rateOfInterest());
		
		r = new HDFC();
		System.out.println(r.rateOfInterest());
		
		r = new Canara();
		System.out.println(r.rateOfInterest());

	}

}

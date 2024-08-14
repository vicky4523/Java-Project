package com.tnsif.day6.secondpackage;

import com.tnsif.day6.firstpackage.Sample; //Sample is called from day6 first package so we have imported
                                           //from the first package class sample 

//if you want to add all other classes in the same program use 
// import com.tnsif.day6.firstpackage.*;

public class SampleDemo {

	public static void main(String[] args) {
		Sample s = new Sample();
		//s.defaultdisplay();
		// you can only access public from other package not default,private and protected
		System.out.println(s.publicdisplay());

	}

}

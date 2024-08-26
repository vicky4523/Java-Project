package com.tnsif.day14;

//can't put public class demo it wont accept if u use public u need to declare in a new file

class demo{ 
	
	void validate(int a)
	{
		if(a<18)
		{
			System.out.println("Not eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}
	
}

public class ThrowMethod {

	public static void main(String[] args) {
		
		demo d = new demo();
		d.validate(17);
	}
}

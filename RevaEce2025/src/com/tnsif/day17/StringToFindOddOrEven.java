package com.tnsif.day17;

public class StringToFindOddOrEven {

	public static void main(String[] args) {
		
		String s1 = " This is a string example ";
		String[] words = s1.split(" "); // array of string - and name of the string array is words
		for(String word : words) // for each loop
		{
			if(word.length()%2==0)
			{
				System.out.println(word);
			}
		}

	}

}

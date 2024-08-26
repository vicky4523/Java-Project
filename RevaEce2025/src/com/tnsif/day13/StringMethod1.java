package com.tnsif.day13;

public class StringMethod1 {

	public static void main(String[] args) {
		 String s = " REVA "; //give "reva" and check in google if u type upper or lower case it'll take 
		 String s1 = new String (" REVA ");
		 
		 System.out.println("Comparision using == " +s==s1);// it'll return false if u use ==
		 System.out.println("Comparision using equals " +s.equals(s1));// .operator u use itll show true
		 System.out.println("Comparision using compareTO " +s.compareTo(s1));//compare to operator will return false
		 
//		 String a =s.toUpperCase();
//		 System.out.println(a.equals(s1));   just trying yo make the output true when s = " reva ";
	}
}

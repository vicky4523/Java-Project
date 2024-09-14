package com.tnsif.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//it's list program not collections

public class SampleCollections {

	public static void main(String[] args) {

	     List  <Integer> list1  = new ArrayList<Integer>();
	     list1.add(100);
	     list1.add(200);
	     list1.add(10);
	     list1.add(1000);
	     
	     System.out.println("Before sorting "+list1);
	     
	     //This wont work so convert it to collections to sort the list
	     
//	     list1.sort((Comparator<? super Integer>) list1);
//	     System.out.println(list1);
//	     list1.iterator();
	     
	     Collections.sort(list1);
	     System.out.println("After sorting "+list1);
	     
	     
	     
	     List  <String> list2 = new ArrayList<String>();
	     list2.add("banana");
	     list2.add("apple");
	     list2.add("mango");
	     list2.add("strawberry");
	     
	     System.out.println("Before sorting "+list2);
	     Collections.sort(list2);
	     System.out.println("After sorting "+list2);
	     
	     

	}

}

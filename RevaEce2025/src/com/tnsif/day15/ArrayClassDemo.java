package com.tnsif.day15;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		
		int arr[] = {10,7,8,36,87,56,86,45,45};
		
//		for (int i: arr)//foreach loop u add +i
//		System.out.println("Array elements are" +i);
		
		//to print elements in one line 
		System.out.println("Array elements are: " +Arrays.toString(arr));
		
		//sort
		Arrays.sort(arr);
		System.out.println("Sorted elements are: " +Arrays.toString(arr));
		
		//binary search it won't work unless array is sorted 
		System.out.println("Element is at pos: " +Arrays.binarySearch(arr, 45));
		
		//for the second 45
		System.out.println("Element is at pos: " +Arrays.binarySearch(arr, 0, 8, 45));
		//(array name, starting index, ending index, key element)
		
		//for 7
		System.out.println("Element is at pos: " +Arrays.binarySearch(arr, 0, 8, 7));
		
		//for 7
		System.out.println("Element is at pos: " +Arrays.binarySearch(arr, 1, 8, 7));// how -2??
		

	}

}

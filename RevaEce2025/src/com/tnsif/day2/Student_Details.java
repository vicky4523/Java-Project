package com.tnsif.day2;

import java.util.Scanner;

public class Student_Details {

	public static void main(String[] args) {
		String name;
		String srn;
		long mob;
		String branch;
		float marks;
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student details:");
		name = sc.next();
		srn = sc.next();
		mob = sc.nextLong();
		branch = sc.next();
		marks = sc.nextFloat();
		age = sc.nextInt();
		
		System.out.println("Student Details "+name+" "+srn+" "+mob+" "+branch+" "+marks+" "+age);
	}
}

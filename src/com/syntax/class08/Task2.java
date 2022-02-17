package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//Create a program that asks the user to apply for a credit card.
		
		Scanner scan=new Scanner(System.in);
		String apply;
		do {
			System.out.println("Apply for a credit card");
			apply=scan.next();
			
		}while (!apply.equalsIgnoreCase("yes"));
		System.out.println("please take your credit card ");
	
	}

}

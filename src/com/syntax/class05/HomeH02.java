package com.syntax.class05;

import java.util.Scanner;

public class HomeH02 {

	public static void main(String[] args) {
		//Write a program that will print whether it is a weekend or weekday.If any day from 1-5 → output “It is a weekday”,
		//anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the day");
		
		int any=input.nextInt();
		
		if (any>=1 && any<=5) {
			System.out.println("It is a weekday");
		}else if(any>=6 && any<=7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("It is a weekend");
		}
		

		
		
	}

}

package com.syntax.class05;

import java.util.Scanner;

public class HomeW002 {

	public static void main(String[] args) {
		// Write a program that will ask user to input inputs the current time (use 24 hour format).
		//Based on the given time define:
			//if hour is between 1-11 --> Morning //if hour between 12-15 --> Afternoon
			//if hour between 16-20 --> Evening  //if hour between 21-24 --> Night

		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Current time");
		
		int bet=input.nextInt();
		
		if (bet>=1 && bet<=11) {
			System.out.println("Morning");
		}else if (bet>=12 && bet<=15) {
			System.out.println("Afternoon");
		}else if (bet>=16 && bet<=20) {
			System.out.println("Evening");
		}else if (bet>=21 && bet<=24) {
			System.out.println("Night");
		}	
		
	}

}

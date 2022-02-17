package com.syntax.class05;

import java.util.Scanner;

public class HomeW004 {

	public static void main(String[] args) {
		// Write a program for user to enter his/hers birth month. Based on the month define the season.
		//Example: if user is born in March, April, May → season =“Spring” 
				//if user is born in June, July, August → season =“Summer”  etc …
		
		
	    Scanner input=new Scanner(System.in);
		System.out.println("enter his/hers birth month");
		
		String sea=input.nextLine();
		
		if (sea.equals("March") || sea.equals("April") || sea.equals("April")) {
		System.out.println("You born in Spring");
		}else if (sea.equals("June") || sea.equals("July") || sea.equals("August")) {
			System.out.println("You born in Summer");
		}else if (sea.equals("September") || sea.equals("October") || sea.equals("November")) {
				System.out.println("You born in Autumn");	
		}else if (sea.equals("December") || sea.equals("January") || sea.equals("February")) {
			System.out.println("You born in Winter");
		}


	}

}

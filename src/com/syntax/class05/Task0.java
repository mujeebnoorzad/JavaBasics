package com.syntax.class05;

import java.util.Scanner;

public class Task0 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a day");
		
		String day="monday or wednesday";
		day=scan.nextLine();
		
		if(day.equalsIgnoreCase("monday")|| day.equals("friday")) {
       
		System.out.println("there is no class today");
		}else if (day.equalsIgnoreCase("tuesday")|| day.equals("wednesday")) {
		System.out.println("manual");
		} else if (day.equalsIgnoreCase("thursday")) {
	System.out.println("review");
    }else if (day.equalsIgnoreCase("saturday")|| day.equals("sunday"));

    System.out.println("manual");
	
	}

}

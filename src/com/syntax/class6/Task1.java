package com.syntax.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		// At the end your program should print which grade was entered by a user with explanation.

		Scanner in=new Scanner(System.in);
		
		System.out.println("enter your grade");
		char pro=in.next().charAt(0);
		
		String student;
		
		switch(pro) {
		case'A':
			student="Excellent";
			break;
		case'B':
			student="Good";
			break;
		case'C':
			student="Average";
			break;
		case'D':
			student="Bad";
			break;
			default:
				student="Not Acceptable";
	
		}
		  System.out.println("You entered "+pro+" that is "+student);
		
	}

}

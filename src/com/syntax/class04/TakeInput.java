package com.syntax.class04;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Please enter country where are you from");
		
		String country=scan.next();
		System.out.println("You are from "+country);

		if (country.equalsIgnoreCase("USA")) {
			System.out.println("You speak enghlish");
			
		}else if(country.equalsIgnoreCase("France")) {
			System.out.println("You speak Franch");
			
		}else if (country.equalsIgnoreCase("Turkey")) {
			System.out.println("You speak Turkish");
		}else {
			System.out.println("I do not know which language you speak");
		
			
		}
	}

}

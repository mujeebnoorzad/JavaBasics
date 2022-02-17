package com.syntax.class6;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
 
		Scanner input=new Scanner(System.in);
		System.out.println("enter your country Please");
		
	   String country=input.nextLine();
		String language;
		
		switch (country.toLowerCase()) {
		
		case "Amerian":
			language="English";
			break;
		case "Arab":
			language="Arabic";
			break;
		case "China":
			language="Chinese";
			break;
		case "India":
			language="Urdo";
			break;
		
			default:
				language="Uknown";
				break;
		}
		System.out.println("In "+country+" people speak "+language);
		

	}

}

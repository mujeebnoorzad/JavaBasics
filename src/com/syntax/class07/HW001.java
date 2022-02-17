package com.syntax.class07;

import java.util.Scanner;

public class HW001 {

	public static void main(String[] args) {
		
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your frist name");
	String fristN=scan.next();
	String lastN=scan.next();
	
	
	int age=scan.nextInt();
	for(int i=0; i<=5; i++) {
		System.out.println("Your name is "+fristN+" your lastname is "+lastN+" and your "+age);
	}

	}

}

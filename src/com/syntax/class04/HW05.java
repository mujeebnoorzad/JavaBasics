package com.syntax.class04;

import java.util.Scanner;

public class HW05 {

	public static void main(String[] args) {
		
		Scanner work=new Scanner(System.in);
		System.out.println("Please enter your experience years");
		
		int year=work.nextInt();
		
		if (year>=5) {
			System.out.println("How much salary do you hav in annual");
			
		int salary=work.nextInt();
		if (salary>=50000) {
			System.out.println("You will get $5000 bonus");
			
		}else {
			System.out.println("You will get over $3000 bonus");
		}
			
		}else {
			System.out.println("You are not eligible for the bonus");
		}

	}

}

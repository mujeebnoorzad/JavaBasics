package com.syntax.class08;

import java.util.Scanner;

public class Eaxple02 {

	public static void main(String[] args) {
		
	
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
				
			}
			System.out.print(i+" ");

	}
      Scanner sc=new Scanner(System.in);
      String answer;
      do {
		System.out.println("Apple for a credit card");
		answer=sc.nextLine();
      }while(answer.equalsIgnoreCase("yes"));
		System.out.println("Here your card");
}
}
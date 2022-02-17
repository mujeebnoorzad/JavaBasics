package com.syntax.class6;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		//HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
		//Based on operator provide the result to user. 

        Scanner in=new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		int number1=in.nextInt();
		int number2=in.nextInt();
		
		System.out.println("Pleaseenter 2 numbers and operator(+,-,*,/).");
		String operator=in.next();
		
		int result=0;
		
		switch(operator) {
		case"+":
			result=number1+number2;
			break;
		case"-":
			result=number1-number2;
			break;	
		case"*":
			result=number1*number2;
			break;
		case"/":
			result=number1/number2;
			break;
			default:
				
				System.out.println("Invalid");		
		}
		 System.out.println("The result is "+result);
		
	}

}

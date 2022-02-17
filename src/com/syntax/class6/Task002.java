package com.syntax.class6;

import java.util.Scanner;

public class Task002 {

	public static void main(String[] args) {
		
       Scanner in=new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		int number1=in.nextInt();
		int number2=in.nextInt();
		
		System.out.println("Pleaseenter 2 numbers and operator(+,-,*,/).");
		String operator=in.next();

		int result=0;
		
		if(operator.equals("+")) {
			result=number1+number2;
		}else if(operator.equals("-")) {
			result=number1-number2;
		}else if(operator.equals("*")) {
			result=number1*number2;	
		}else if(operator.equals("/")) {
			result=number1/number2;	
		}else {
			System.out.println("Invalid");		
			}
			 System.out.println("The result is "+result);
			
		}
		
	}



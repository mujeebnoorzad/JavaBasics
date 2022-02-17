package com.syntax.class07;

import java.util.Scanner;

public class HW002 {

	public static void main(String[] args) {
		
		int coffee=3;
		Scanner input=new Scanner(System.in);
        int coffeeP;
        do {
        	System.out.println("Please pay for your coffee");
        	coffeeP=input.nextInt();
        	
        
        }while (coffeeP!=coffee);
        System.out.println("get your coffee");
	}

}

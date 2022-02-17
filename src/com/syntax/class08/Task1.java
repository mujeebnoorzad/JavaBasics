package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		// print numbers from 1 to 50 except those that are divided by 3.
		
		System.out.println(" print numbers from 1 to 50 except those that are divided by 3");
		for (int p=1; p<=50; p++) {
			if(p%3!=0) {
				System.out.print(p+" ");
			}
		}

	}

}

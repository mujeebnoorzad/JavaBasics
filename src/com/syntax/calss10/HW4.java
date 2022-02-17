package com.syntax.calss10;

public class HW4 {

	public static void main(String[] args) {
		
		int [] number= {15,45,10,32};
		
		int largest=number[0];
		
		for(int n=0; n<number.length; n++) {
			if (number[n]> largest) {
				largest=number[n];
				
			}
		}
    System.out.println(largest);
	}

}

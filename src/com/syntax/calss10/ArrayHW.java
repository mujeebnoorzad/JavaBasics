package com.syntax.calss10;

public class ArrayHW {

	public static void main(String[] args) {
	
		String[] cars= {"Audi", "BMW","Hunda", "Ford", "Kia", "Lexus"};
		
		for (int i=0; i<=cars.length; i++) {
			System.out.println(cars[i]+" ");
		}
 for (String car:cars) {
	 
	 System.out.println(car);
 }
	}

}

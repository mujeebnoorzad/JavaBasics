package com.syntax.calss10;

public class Task1 {

	public static void main(String[] args) {
		
		String[] countries= {"USA", "Afghanistan", "India"};
		String capital=null;
		for (int i=0; i<countries.length; i++) {
			
			System.out.println(countries[i]);
			
			switch(countries[i]) {
			case "Usa":
				capital="Ca";
				break;
			case "Afghanistan":
				capital="Kabul";
				break;
			case "India":
				capital="Dehli";
				break;
			
			}
			
		System.out.println("The capital of the "+countries[i]+" is "+capital);
		
		
		
		}

	}

}

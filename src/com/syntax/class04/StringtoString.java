package com.syntax.class04;

public class StringtoString {

	public static void main(String[] args) {
		
		boolean allergy=true;
		
		if(allergy) {
			
			System.out.println("let 's check what allergies you have");
			
			String allergyType="peanut";
			
			if (allergyType.equals("pollen")) {
				System.out.println("Please stay at home when tree are blooming. take med A ");
				
			}else if (allergyType.equals("peanut")) {
				System.out.println("Please do not eat food that contains nuts. take med B");
				
			}else if (allergyType.equals("gluten")) {
				System.out.println("Please follow gluten free diet.Take med C");
			}else {
				System.out.println("I don't which suggestion to give you");
				
			}
					
		}else {
			System.out.println("you are lucky");
		}

	}

}

package com.syntax.class09;

public class Task02 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String [] names={"Ahmad","Omar","Zaki","Osman"};
	       System.out.println("My name is "+names[0]);
		String[] names1=new String[4];
		names1[0]="Ahamd";
		names1[1]="Omar";
		names1[2]="Zaki";
		names1[3]="Osman";
		
		System.out.println("My name is "+names1[2]);

	}

}

package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=1;
		
		int[] numbers=new int[4];
		
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+numbers[0]);

		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		
		System.out.println(countries[3]+countries[4]);
		
		String[] names=new String[5];
		names[1]="Orsan";
		names[2]="Gulnar";
		names[3]="Zakirullah";
		names[1]="Orsan";
		
		System.out.println("Values in index 0 is ="+names[0]);
		
	}

}

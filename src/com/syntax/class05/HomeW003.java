package com.syntax.class05;

import java.util.Scanner;

public class HomeW003 {

	public static void main(String[] args) {
		// 3. Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
     //if the average score >=90 → grade=A   //if the average score >= 70 and <90 → grade=B //if the average score>=50 and <70 → grade=C  //if the average score<50 → grade=F

		Scanner input=new Scanner(System.in);
		
		System.out.println("quiz");
		int g1=input.nextInt();
		
		System.out.println("mid term");
		int g2=input.nextInt();
		
		System.out.println("final scores");
		int g3=input.nextInt();
		
		int averageS=(g1+g2+g3)/3;
		
		if(averageS>=90) {
			System.out.println("grade A");
		}else if(averageS>=70 && averageS<90) {
			System.out.println("grade B");
		}else if(averageS>=50 && averageS<70) {
			System.out.println("grade C");
		}else if (averageS<50) {
			System.out.println("grade F");
		}
	
	}

}

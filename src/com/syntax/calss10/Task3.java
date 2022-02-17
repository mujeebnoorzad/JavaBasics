package com.syntax.calss10;

public class Task3 {

	public static void main(String[] args) {
		//Create a 2D array (longer way)where you will store the 
		//following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print following String:Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String [][] fullN=new String[3][4];
		fullN[0][0]="Mr";
		fullN[0][1]="Mrs";
		fullN[0][2]="Ms";
		fullN[0][3]="Miss";
		
		fullN[1][0]="Smith";
		fullN[1][1]="Jordan";
		fullN[1][2]="Jackson";
		fullN[1][3]="Obama";
		
		
		
		System.out.println(fullN[0][0]+fullN[1][0]+","+fullN[0][1]+fullN[1][1]+","+fullN[0][2]+fullN[1][2]+","+fullN[0][3]+fullN[1][3]+",");

	}

}

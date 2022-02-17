package com.syntax.class07;

public class Task4 {

	public static void main(String[] args) {
		int numEv=0;
		int numOdd=0;
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
		numEv+=i;
			}else {
				numOdd+=i;
			}
		}
		System.out.println("The sum of all even numbers= "+numEv+" and the sum of all odd numbers= "+numOdd);;
		

	}

}

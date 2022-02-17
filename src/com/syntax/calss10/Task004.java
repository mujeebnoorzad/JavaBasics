package com.syntax.calss10;

public class Task004 {

	public static void main(String[] args) {
		//Create a 2D array of integers. Develop a program which will
				//calculate the sum of  even and odd numbers for that array.
				
				// Sum of Numbers: Even & Odd Numbers...>>
				int[] [] num = {{ 10, 20, 11},
				               {23,24,15},
				               {21,22,31},
				};
				int odd = 0;
				int even = 0;
				for (int i = 0; i <num.length; i++) {
					for(int j=0; j<num[0].length; j++) {
						if (i % 2 == 0) {
						odd = odd + i;
					}else {
						even = even + i;
						
					}
						System.out.print(num[i][j]);
					}
				}
				











		










	}

}

package com.syntax.calss10;

public class TwoDArrayAnotherway {

	public static void main(String[] args) {
		
		int [][] numbers= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}
				};
		int size=numbers.length;
      System.out.println(size);
      
      int sizeof1Array=numbers[0].length;
      System.out.println("Size of first array="+sizeof1Array);
      
      int sizeof2Array=numbers[1].length;
      System.out.println("Size of sencod array="+sizeof2Array);
      
      int sizeof3Array=numbers[3].length;
      System.out.println("Size of third array="+sizeof3Array);
	}

}

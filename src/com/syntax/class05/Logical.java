package com.syntax.class05;

public class Logical {

	public static void main(String[] args) {

	boolean likeJava=true;	
    boolean understandJava=true;

    if (likeJava && understandJava) {
    	System.out.println("This is best combination");
    }
    
    int num1=10;
    int num2=20;
    int num3=30;
    
    if (num1>num2 && num1>num3) {
    	System.out.println(num1+" is the largest");
    }else if (num2>num1 && num2>num3) {
    	System.out.println(num2+" is the largest");
     }else if (num3>num1 && num3>num2) {
    	System.out.println(num2+" is the largest");
    }
    
    System.out.println("End of the code");
    
	}

}

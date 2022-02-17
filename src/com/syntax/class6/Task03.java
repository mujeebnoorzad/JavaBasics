package com.syntax.class6;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		 Scanner in=new Scanner(System.in);
			
			System.out.println("Enter value for sale price yes or no ?");
			String answer=in.next();
			
            int  dis=in.nextInt();
            if (answer.equals("Yes"))  {
            	System.out.println("What is the sale price");	
            }
            int prItem=350;
            if(prItem<20) {
            	dis=10;
            }else if (prItem>=20 && prItem<=100) {
                dis=20;
            } else if (prItem>=100 && prItem<=500) {
            	dis=30;
            }else {
            	dis=50;
            }
            double afterDis=prItem-(prItem*dis)/200;
            System.out.println("After "+dis+"% the price of the item reduce from %"+prItem);
                
            	
            }
            		
	}



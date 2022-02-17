package com.syntax.class6;

public class SwichIntro {

	public static void main(String[] args) {
		
		int day=7;
		
		String dayName;
		
		if (day==1) {
		dayName="Monday";
		}else if (day==2) {
		 dayName="Tuesday";
		}else if (day==3) {
			 dayName="Wednesday";
		}else if (day==4) {
			 dayName="Thursday";
		}else if (day==5) {
			 dayName="Friday";
		}else if (day==6) {
			 dayName="Saturday";
		}else if (day==7) {
			 dayName="Sunday";	 
		}else {
			 dayName="Invalid";
		}
		
		System.out.println(dayName);
		
		switch (day) {
		
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuseday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Firday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
			default:
				dayName="Invaild";
				break;
		}
		System.out.println(dayName);
		
		
		}
		

	}



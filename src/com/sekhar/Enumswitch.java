package com.sekhar;

public class Enumswitch {
    enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,}
	public static void main(String[] args) {
		Day day=Day.SUNDAY;
		
		switch(day){
		case SUNDAY: 
		 System.out.println("its holiday");
		 break;
		case MONDAY: 
		 System.out.println("its working day");
		 break;
		default:
		System.out.println("other day");
		}
	}	
}

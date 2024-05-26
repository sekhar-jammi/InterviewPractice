package com.sekhar2;

import java.util.Scanner;

public class Length_of_string_without_Length {

	public static void main(String[] args) {
		   Scanner sc = new Scanner (System.in);
		   System.out.println("enter to string fo find length:");
		   String str=sc.nextLine();
		   int length=0;
		   char [] strarray=str.toCharArray();
		   for(char ch:strarray) {
			   length++;
		   }
		   System.out.println("length of string:"+length);

	}

}

package com.sekhar2;

import java.util.Scanner;

public class VowelsinString {

	public static void main(String[] args) {
		   Scanner sc =new Scanner(System.in);
		   System.out.println("Enter string:");
		   String str= sc.nextLine();
		   str.toLowerCase();
		   System.out.println("string to count number of vowels is:"+str);
		   int count=0;
		   for(int i=0; i<str.length();i++) {
			   if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				   count++;
				   
			   }
		   }
		   System.out.println("total no of vowels in string is:"+count);

	}

}

package com.sekhar2;

import java.util.Scanner;

public class LowerToUpper {

	public static void main(String[] args) {
		   Scanner sc = new Scanner (System.in);
		   System.out.println("enter string to convert:");
		   String str1=sc.nextLine();
		   String str2="";
		   for(int i=0; i<str1.length();i++) {
			   char ch =str1.charAt(i);
			   if(ch>='a'&&ch<='z') {
				   ch=(char)(ch-32);
			   }
			   str2=str2+ch;
		   }
		   System.out.println(str2);
		   

	}

}

package com.sekhar2;

import java.util.Scanner;

public class CountEachChar {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter string:");
		   String str= sc.nextLine();
		   int[] counter =new int[256];
		   for(int i=0; i<str.length();i++) {
			   counter[(int)str.charAt(i)]++;
		   }
		   for(int i=0; i<256;i++) {
			   if(counter[i]!=0) {
				   System.out.println((char)i+"-->"+counter[i]);
			   }
		   }

	}

}

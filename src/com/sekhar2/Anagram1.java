package com.sekhar2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1= sc.nextLine();
		
		System.out.println("Enter second string:");
		String s2= sc.nextLine();
		
		if(checkanagram(s1,s2))
			System.out.println(" strings are angrams");
		else
			System.out.println(" strings are not anagrams");
		
		
		

	}
	
	public static boolean checkanagram(String s1, String s2) {
		   s1=s1.replaceAll("\\s"," ");
		   s2=s2.replaceAll("\\s"," ");
		   
		   if(s1.length()!=s2.length())
			   return false;
		   else {
			   char[] arr1= s1.toLowerCase().toCharArray();
			   char[] arr2= s2.toLowerCase().toCharArray();
			   
			   Arrays.sort(arr1);
			   Arrays.sort(arr2);
			   
			   return(Arrays.equals(arr1,arr2));
		   }
	}
	
	
}

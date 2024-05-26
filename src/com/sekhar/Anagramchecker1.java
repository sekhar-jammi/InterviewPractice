package com.sekhar;

import java.util.Arrays;
import java.util.Scanner;


public class Anagramchecker1 {

	public static void main(String[] args) {
		//taking input strings from user
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first string:");
		String s1=sc.nextLine();
		System.out.print("Enter second string:");
		String s2=sc.nextLine();
		
		if(checkanagram(s1,s2))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		
	}
	public static boolean checkanagram(String s1,String s2) {
		//replacing white spaces
		s1=s1.replaceAll("\\s", "");
		s2=s2.replaceAll("\\s", "");
		//checking the length
		if(s1.length()!=s2.length())
			return false;
		else {
			//convert string into lower case and into char array
			char [] arr1=s1.toLowerCase().toCharArray();
			char [] arr2=s2.toLowerCase().toCharArray();
			//sorting the arrays
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			//checkinng equal
			return(Arrays.equals(arr1, arr2));
		}
		
	}
	
}
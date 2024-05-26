package com.sekhar;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;


public class Anagramchecker3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first string:");
		String s1=sc.nextLine();
		System.out.print("Enter second string:");
		String s2=sc.nextLine();
		if(checkanagram(s1,s2))
			System.out.print("Anagrams");
		else
			System.out.print("Not Anagrams");
		
	}
    public static boolean checkanagram(String s1,String s2) {
    	s1=s1.replaceAll("\\s", "").toLowerCase();
    	s2=s2.replaceAll("\\s", "").toLowerCase();
    	 
    	if(s1.length()!=s2.length())
    		return false;
    	List<Character> list1=new ArrayList<Character>();
    	List<Character> list2=new ArrayList<Character>();
    	
    	for(int i=0;i<s1.length();i++) {
    		list1.add(s1.charAt(i));
    	}
    	for(int i=0;i<s2.length();i++) {
    		list2.add(s2.charAt(i));
    	}
    	
    	Collections.sort(list1);
    	Collections.sort(list2);
    	if(list1.equals(list2))
    		return true;
    	else
    		return false;
    }
	
	
	
}

package com.sekhar2;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		   Scanner sc= new Scanner(System.in);
		   System.out.println("enter first string:");
		   String s1=sc.nextLine();
		   System.out.println("enter second string:");
		   String s2= sc.nextLine();
		   
		   if(checkanagram(s1,s2))
			   System.out.println("strings are anagrams");
		   else
			   System.out.println("strings are not anagrams");
			   

	}
	
	public static boolean checkanagram(String s1, String s2) {
		   if(s1.length()!=s2.length())
			   return false;
		   HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		   
		   for(int i=0;i<s1.length();i++) {
			   char c= s1.charAt(i);
			   if(map.containsKey(c))
				   map.put(c,map.get(c)+1);
			   else
				   map.put(c, 1);
		   }
		   for(int i=0; i<s2.length();i++) {
			   char c= s2.charAt(i);
			   if(map.containsKey(c)) {
				   if(map.get(c)==1)
					   map.remove(c);
				   else
					   map.put(c, map.get(c)-1);
				   
				   
			   }else
				   return false;
		   }
		   if(map.size()>0)
			   return false;
		   return true;
			
	}

}

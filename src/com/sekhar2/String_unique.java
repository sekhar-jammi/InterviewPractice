package com.sekhar2;

import java.util.HashSet;

public class String_unique {

	public static void main(String[] args) {
		   String s1="sekhar";
		   
		   if(hasallunique(s1))
		      System.out.println("string  has all unique characters");
		   else
			   System.out.println("sring dont have unique characters");

	}
	public static boolean hasallunique( String s1) {
		   HashSet set= new HashSet();
		   for(int i=0;i<s1.length();i++) {
			   char ch=s1.charAt(i);
			   if(!set.add(ch))
				   return false;
		   }
		   return true;
		   
	}

}

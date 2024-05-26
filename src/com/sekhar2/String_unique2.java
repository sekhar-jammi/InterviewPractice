package com.sekhar2;

public class String_unique2 {

	public static void main(String[] args) {
	       String s1="sekhar";
	       if(hasallunique(s1))
	    	   System.out.println("string has unique characters");
	       else
	    	   System.out.println("string dont have unique characters");

	}
	public static boolean hasallunique(String s1) {
		   for(int i=0; i<s1.length();i++) {
			   char ch=s1.charAt(i);
			   if(s1.indexOf(ch)!=s1.lastIndexOf(ch))
				   return false;
		   }
		   return true;
	}
	
}

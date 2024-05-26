package com.sekhar;

public class Palindrome {

	public static void main(String[] args) {
		String str="rotator";
		String revstr=reversestring(str);
		if(str.equals(revstr)) {
			System.out.println("the string is palindrome");
		}
		else {
			System.out.println("the string is not palindrome");
		}
	}
    public static String reversestring(String str) {
    	String revstr="";
    	for(int i=str.length()-1;i>=0;i--) {
    	   revstr=revstr+str.charAt(i);	
    	}
    	return revstr;
    }
}

package com.sekhar2;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		   Scanner  sc = new Scanner (System.in);
           System.out.println("enter string:");
           String str= sc.nextLine();
           String rev="";
           for(int i=str.length()-1;i>=0;i--) {
        	   rev=rev+str.charAt(i);
           }
           if(str.equals(rev)) {
        	   System.out.println("string is palindrome");
           }
           else {
        	   
               System.out.println("string is not palindrome");
           }
	}

}

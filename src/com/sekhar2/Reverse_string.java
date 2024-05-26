package com.sekhar2;

public class Reverse_string {

	public static void main(String[] args) {
		   String str="sekhar";
		   String rev=" ";
		   char ch;
		   
		   for(int i=0; i<str.length();i++) {
			   ch=str.charAt(i);
			   rev=ch+rev;
		   }
		   System.out.println(rev);

	}

}

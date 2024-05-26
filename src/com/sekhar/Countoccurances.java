package com.sekhar;

public class Countoccurances {

	public static void main(String[] args) {
		 String str="raja sekhar jammi";
		 char ch='a';
		 int count=0;
		 for (int i=0;i<str.length();i++) {
			 if(str.charAt(i)==ch) {
				 count=count+1;
			 }
		 }
		System.out.println("the character"+ch+"occured"+count+"timesin"+str);	
		}

	}



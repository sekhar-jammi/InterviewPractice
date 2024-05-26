package com.sekhar;

public class Stringformatter2 {
	public static String reversestring(String str) {
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		return rev;
	}
	

	public static void main(String[] args) {
		System.out.println(Stringformatter.reversestring("my name is khan"));
		System.out.println(Stringformatter.reversestring("my nameis hahahhah"));
	}

}

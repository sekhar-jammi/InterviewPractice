package com.sekhar;

public class Stringformatter {
	public static String reversestring(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(Stringformatter.reversestring("my name is khan"));
		System.out.println(Stringformatter.reversestring("my name is hhhalal"));

	}

}

package com.sekhar2;

public class StringUpperCaseTest {

	public static void main(String[] args) {
		 String s = new String("text");
		 String s2 = "text";
		 String s3 = s.toUpperCase();
		 System.out.println(s==s3);
		 System.out.println(s.equals(s2));
		 System.out.println(s2.equalsIgnoreCase(s3));

	}

}

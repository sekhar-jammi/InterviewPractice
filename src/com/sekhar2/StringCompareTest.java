package com.sekhar2;

public class StringCompareTest {

	public static void main(String[] args) {
		String st1 = "Ivaan";
		 String st2 = "Hilery";
		 String st3 = "Ivaan";
		 String st4 = new String("Ivaan");
		 System.out.println(st1.compareTo(st2));
		 System.out.println(st1.compareTo(st3));
		 System.out.println(st3.compareTo(st1));
		 System.out.println(st2.compareTo(st4));

	}

}

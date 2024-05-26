package com.sekhar;

public class Removecharacter {

	public static void main(String[] args) {
		String str="Scaler by tech";
		System.out.println("string after removing 'e'"+str.replace("e", ""));
		System.out.println("string after first occurances of'e'"+str.replaceFirst("e", ""));

	}

}

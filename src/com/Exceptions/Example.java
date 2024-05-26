package com.Exceptions;

public class Example {

	public static void main(String[] args) {
		try {
			System.out.println("Hai");
			System.out.println(99/0);
		}
		catch(ArithmeticException e){
			System.out.println("Hello");
			
		}
		System.out.println("welcome");

	}

}

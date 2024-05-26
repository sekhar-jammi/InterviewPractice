package com.Exceptions;

public class Example2 {

	public static void main(String[] args) {
		try {
			System.out.println("Hai");
			System.out.println(99/0);
		}catch(ArithmeticException e) {
			System.out.println("hello");
		}
		finally {
			System.out.println("have a nice day");
		}

	}

}

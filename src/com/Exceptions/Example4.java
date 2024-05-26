package com.Exceptions;

public class Example4 {

	public static void main(String[] args) {
		try {
			System.out.println("Hai");
			System.out.println(99/0);
		}
		finally {
			System.out.println("Hello");
		}
		System.out.println("welcome");

	}

}

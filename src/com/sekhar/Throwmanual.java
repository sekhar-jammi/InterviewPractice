package com.sekhar;

public class Throwmanual {

	public static void main(String[] args) {
		try {
			ArithmeticException ae= new ArithmeticException();
			throw ae;
		}catch(ArithmeticException e) {
			System.out.println("caugth manually thrown exception");
		}
		
	}

}

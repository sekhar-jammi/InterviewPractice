package com.sekhar;

public class Catchrethrow {

	public static void main(String[] args) {
		try {
			ArithmeticException ae=new ArithmeticException();
			throw ae;		
		}catch(ArithmeticException e) {
			System.out.println("re throwing exception");
			throw e;
		}

	}

}

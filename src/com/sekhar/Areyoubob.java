package com.sekhar;

public class Areyoubob {
	public static void main(String[] unused) {

		String bob = new String("bob");

		String notBob = bob;

		System.out.print((bob==notBob)+" "+(bob.equals(notBob)));
		//System.out.println(12 + 6 * 3 % (1 + 1));

		}
}

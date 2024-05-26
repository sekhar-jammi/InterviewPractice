package com.sekhar;

public class Laregestinarray {

	public static void main(String[] args) {
		int [] array= {10,3,8,30,40,50};
		int largest=array[0];
		for(int n:array) {
			if(n>largest) {
				largest=n;
			}
		}
		System.out.println(" largest number is "   + largest );
	}
	

}

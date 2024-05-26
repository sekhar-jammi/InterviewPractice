package com.arrays;

public class Smallest {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		
		int min=a[0];
		
		for (int i:a) {
			if(i<min) {
				min=i;
			}
		}
		System.out.println(min);

	}

}

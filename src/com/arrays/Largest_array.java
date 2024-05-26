package com.arrays;

public class Largest_array {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		
		int max=a[0];
		
		for(int i:a) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println(max);

	}

}

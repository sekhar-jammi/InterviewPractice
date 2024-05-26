package com.arrays;

public class Array_out_of_bound {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4};
		for (int i=0;i<=a.length;i++) {
			System.out.println(a[i]);
		}

	}

}

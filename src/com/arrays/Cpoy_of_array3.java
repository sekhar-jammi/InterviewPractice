package com.arrays;

public class Cpoy_of_array3 {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int [] b=a.clone();
		b[0]++;
		
		System.out.println("contents of a[]:");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		
		System.out.println("contents of  b[]:");
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]+" ");

	}

}

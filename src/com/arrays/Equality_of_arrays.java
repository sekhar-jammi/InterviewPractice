package com.arrays;

import java.util.Arrays;

public class Equality_of_arrays {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int [] b= {1,2,3};
		boolean result=Arrays.equals(a, b);
		if(result==true)
			System.out.println("arrays are equal");
		else
			System.out.println("arrays are not equal");

	}

}
     
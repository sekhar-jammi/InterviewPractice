package com.sekhar;

public class Smallestinarray {

	public static void main(String[] args) {
		int[] array= {8,1,2,4,5,7,};
		int smallest=array[0];
		for(int n:array) {
			if(n<smallest) {
				smallest=n;
			}
		}
        System.out.println(" smallest number in array is " +smallest );
	}

}


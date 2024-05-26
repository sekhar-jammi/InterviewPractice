package com.arrays;

public class Specific_element {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,5,6,7,8,9,10};
		int element=6;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				System.out.println("element  is find at"+i);
			}
		}
			

	}

}

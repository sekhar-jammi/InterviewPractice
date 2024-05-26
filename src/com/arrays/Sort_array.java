package com.arrays;

import java.util.Arrays;

public class Sort_array {

	public static void main(String[] args) {
		int[] a=new int[] {1,3,4,5,7,8,2,10};
		//Arrays.sort(a);
		//System.out.println("elements of array after sorting:");
		//for(int i=0;i<a.length;i++) {
		//	System.out.print(a[i]+" ");
		//}
		System.out.println("array after sorting:");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.println(a[i]+" ");
		}

	}

}

package com.arrays;

public class Intersection {
	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,5,6};
		int [] arr2= {2,3,4,7,8};
		
		int m=arr1.length;
		int n=arr2.length;
		
		int i=0;
		int j=0;
		
		System.out.println("intersection os arrays:");
		
		while(i<m&&j<n) {
			if(arr1[i]<arr2[j])
				i++;
			else if(arr2[j]<arr1[i])
				j++;
			else {
				System.out.println(arr2[j++]+" ");
				i++;
			}
		}
	}

}

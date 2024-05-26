package com.arrays;

public class Copy_of_array2 {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
			b[i]=a[i];
		b[0]++;
		
		System.out.println("contents of a[]:");
		  for(int i=0;i<a.length;i++)
			  System.out.println(a[i]+" ");
		  
        System.out.println("conntents of b[]:");
           for(int i=0;i<b.length;i++)
        	   System.out.println(b[i]+" ");
	}

}

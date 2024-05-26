package com.arrays;

public class Copy_of_array {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b=new int[a.length];
		b=a;
		b[0]++;
		System.out.println("contents of a[]:") ;
		   for(int i=0;i<a.length;i++)
			   System.out.print(a[i]+" ");
		System.out.println("contents of b[]");
		   for(int i=0;i<b.length;i++)
			   for (int i1=0;i1<b.length;i1++)
				   System.out.print(b[i1]+" ");

	}

}

package com.arrays;

import java.util.Scanner;

public class Desiredelement {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		
		System.out.println("enter element to find:");
		
		Scanner sc= new Scanner(System.in);
		int ele=sc.nextInt();
		
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				index=i;
				break;
			}
		}
		if(index==-1) 
			System.out.println("element not find in array");
		else
			System.out.println("element find at index"+index);
			
		

	}

}

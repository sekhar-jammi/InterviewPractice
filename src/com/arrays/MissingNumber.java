package com.arrays;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println(" enter n values:");
           
           int n= sc.nextInt();
           
           int[] inputarray=new int[n];
           System.out.println("enter n-1 values:");
           for(int i=0;i<=n-2;i++) {
        	   inputarray[i]=sc.nextInt();
           }
           int sumofall=(n*(n+1)/2);
           int sumofarray=0;
            for (int i=0;i<=n-2;i++) {
            	sumofarray=sumofarray+inputarray[i];
            }
            int missingnumber=sumofall-sumofarray;
            System.out.println(missingnumber);
	}

}

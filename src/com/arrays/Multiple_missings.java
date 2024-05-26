package com.arrays;

import java.util.Arrays;

public class Multiple_missings {

	public static void main(String[] args) {
		int [] a= {1,2,5,3,2,4,5,7,6,2,5,7};
		Arrays.sort(a);
		int [] b=new int[a.length];
		
		for(int i:a) {
			b[i]=1;
		}
        System.out.println("missing elements:");
        for(int  i=1;i<b.length;i++)
        	if(b[i]==0) {
        		System.out.println(i);
        	}
	}

}

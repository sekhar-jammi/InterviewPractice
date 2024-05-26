package com.arrays;

import java.util.HashSet;

public class Firstrepeating {

	public static void main(String[] args) {
		int [] a= {1,2,3,1,4,5,6};
		
		HashSet<Integer> set=new HashSet<>();
		
		int min=-1;
		
		for(int i=a.length-1;i>=0;i--) {
			if(set.contains(a[i])) 
				min=i;
			else
				set.add(a[i]);
				
		}
		if(min!=-1)
			System.out.println("the first repeatin element:"+a[min]);
		else
			System.out.println("there is no repeating elements");

	}

}

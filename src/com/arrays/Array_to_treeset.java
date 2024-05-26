package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Array_to_treeset {

	public static void main(String[] args) {
		Integer[] arr= {5,4,3,2,1};
		//1
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		
		for(Integer ele:arr) {
			treeset.add(ele);
		}
		System.out.println(treeset);
		//2
		TreeSet<Integer> treeset1= new TreeSet<Integer>();
		treeset.addAll(Arrays.asList(arr));
		System.out.println(treeset);
		//3
		TreeSet<Integer> treeset2= new TreeSet<Integer>();
		Collections.addAll(treeset2,arr);
		System.out.println(treeset2);
		

	}

}

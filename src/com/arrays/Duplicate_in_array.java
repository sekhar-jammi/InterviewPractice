package com.arrays;

import java.util.TreeSet;

public class Duplicate_in_array {

	public static void main(String[] args) {
		String [] sarr=new String[] {"a","b","c","a","b"};
		
		TreeSet<String> treeset= new TreeSet<String>();
		
		System.out.println("duplicate entries:");
		for(String str:sarr) {
			if(!treeset.add(str)) {
				System.out.println(str);
			}
		}
		

	}

}

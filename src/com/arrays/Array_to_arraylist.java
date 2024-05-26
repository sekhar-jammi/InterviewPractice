package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_to_arraylist {

	public static void main(String[] args) {
		String [] sarr= {"a","b","c","d","e"};
		
		//1
		List<String> list= Arrays.asList(sarr);
		System.out.println(list);
		
		//2
		List<String> list1=new ArrayList<String>();
		Collections.addAll(list1,sarr);
		System.out.println(list1);
		
		//3
		List<String> list2=new ArrayList<String>();
		for(String ele:sarr) {
			list2.add(ele);
		}
		System.out.println(list2); 
		

	}

}

package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistTest12 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
	     list.add(20);
	     list.add(10);
	     list.add(5);
	     list.add(30);
	   for(Integer i : list) {
	      System.out.println(i);
	      list.remove(3);
	    } 

	}

}

package com.collections;

import java.util.ArrayList;

public class ArraylistTest8 {

	public static void main(String[] args) {
		  ArrayList<String> list = new ArrayList<String>();
		  list.add(null);
		  list.add(0, "Zero");
		  list.add(null);
		  
		  list.add(2, "Two");
		  list.add("Four");
		  list.add(1, "One");
		  list.remove(2);
		  System.out.println(list);

	}

}

package com.collections;

import java.util.ArrayList;

public class Replace_elements {

	public static void main(String[] args) {
		  ArrayList<String> list = new ArrayList<String>();
	      list.add("a");
	      list.add("b");
	      list.add("c");
	      list.add("d");
	      System.out.println(list);
	      list.set(2, "e");
	      System.out.println(list);

	}

}

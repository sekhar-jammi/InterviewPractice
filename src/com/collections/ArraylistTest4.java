package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArraylistTest4 {

	public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
	     list.add("A");
	     list.add("B");
	     Collection<String> c = new ArrayList<>();
	     c.add("C");
	     list.addAll(1, c);
	     System.out.println(list);
	}

}

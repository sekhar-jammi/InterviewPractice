package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArraylistTest14 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
	    list.add("John");
	    list.add("Herry");
	    list.add("Ivaan");
	    list.add("Deep");
	    ListIterator<String> litr = list.listIterator();
	    while(litr.hasNext()) {
	     System.out.println(litr.next());
	   }

	}

}

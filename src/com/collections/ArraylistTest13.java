package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistTest13 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
	    list.add("John");
	    list.add("Herry");
	    list.add("Ivaan");
	    list.add("Deep");
	  Iterator<String> itr = list.iterator();
	  while(itr.hasNext())
	  {
	    String str = itr.next();
	     if(str.equals("Herry")) {
	        itr.remove();
	        System.out.println(list);
	    }

	}

}}

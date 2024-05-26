package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_in_reverse {

	public static void main(String[] args) {
		  ArrayList<String> aList = new ArrayList<String>();
	      aList.add("A");
	      aList.add("B");
	      aList.add("C");
	      aList.add("D");
	      aList.add("E");
	      ListIterator<String> li = aList.listIterator();
	      while (li.hasNext()) {
	         li.next();
	      }
	      System.out.println("The ArrayList elements in the reverse direction are: ");
	      while (li.hasPrevious()) {
	         System.out.println(li.previous());
	      }

	}

}

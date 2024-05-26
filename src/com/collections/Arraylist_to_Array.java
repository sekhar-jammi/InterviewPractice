package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_to_Array {

	public static void main(String[] args) {
		   List<String> list= new ArrayList<String>();
		   list.add("a");
		   list.add("b");
		   list.add("c");
		   list.add("d");
		   System.out.println(list);
		   
		   String [] array= list.toArray(new String[list.size()]);
		   for(String s:array) {
			   System.out.println(s);
		   }
		   
		   
	}

}

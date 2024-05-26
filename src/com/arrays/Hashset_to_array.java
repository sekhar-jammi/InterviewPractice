package com.arrays;

import java.util.HashSet;

public class Hashset_to_array {

	public static void main(String[] args) {
		   HashSet<String> set=new HashSet <String>();
		   set.add("a");
		   set.add("b");
		   set.add("c");
		   set.add("d");
		   System.out.println(set);
		   
		   String[] sarr=new String[set.size()];
		   
		   set.toArray(sarr);
		   
		   for(String ele:sarr)
			   System.out.println(ele);

	}

}

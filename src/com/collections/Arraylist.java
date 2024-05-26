package com.collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		   ArrayList al= new ArrayList(); 
		   
		   al.add("1");
		   al.add("m");
		   al.add("9.0");
		   al.add("true");
		   
		   System.out.println(al);
		   
		   al.add(2,"10.0");
		   al.add("m");
		   al.add("null");
		   
		   System.out.println(al);
	}

}

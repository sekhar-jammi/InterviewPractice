package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistTest10 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
	     list.add(20);
	     list.add(0, 30);
	     list.add(2, 40);
	     list.add(40);
	     Object element = list.get(1);
	     System.out.println(element);
	}

}

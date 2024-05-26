package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistTest11 {

	public static void main(String[] args) {
		    List<Integer> list = new ArrayList<>();
		    list.add(20);
		    list.add(0, 30);
		    list.add(2, 40);
		    list.add(50);
		    list.add(3, 60);
		    list.set(1, 80);
		    Object element = list.get(4);
		    System.out.println(element);

	}

}

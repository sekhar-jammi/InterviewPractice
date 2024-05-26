package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Descending_order {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(4);
		num.add(2);
		num.add(6);
		num.add(1);

		System.out.println("List of integer before sorting : "+num);
		Collections.sort(num, Collections.reverseOrder());  //sort the arraylist in descending order
		
		System.out.println("List of integer after sorting in descending order : "+num);
	}

	}



package com.arrays;

import java.util.Arrays;

public class RemoveObjectFromArray {

	public static void main(String[] args) {
		   int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   System.out.println("original array:"+Arrays.toString(array));
		   int removeindex=3;
		   for (int i=removeindex;i<array.length-1;i++) {
			   array[i]=array[i+1];
		   }
		   System.out.println("array after removing element:"+Arrays.toString(array));
		   
}
}

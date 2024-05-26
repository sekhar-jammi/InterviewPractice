package com.arrays;

public class Element_index {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5,6,7,8};
		int element=6;
		int index=-1;
		for (int i=0;i<array.length;i++) {
			if(array[i]==element) {
				index=i;
				break;
			}
		}
		System.out.println(" index of " + element + " is " + index);

	}

}

package com.arrays;

public class Target_in_array {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5,6,7,8,9,10};
		int target=4;
		for(int i=0;i<array.length;i++) {
			if(array[i]==target){
				System.out.println(" target found at index number " +i);
			}
		}
		

	}

}

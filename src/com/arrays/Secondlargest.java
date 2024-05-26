package com.arrays;

import java.util.Arrays;

public class Secondlargest {

	public static void main(String[] args) {
		   int[] arr= {1,2,3,4,5,7,6};
		   int temp;
		   for(int i=0;i<arr.length;i++) {
			  for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		      }
		   }
		   System.out.println(arr.length-1);
		   
		   /*Arrays.sort(arr);
		   System.out.println("sorted array:"+Arrays.toString(arr));
		   int res=arr.length-1;
		   System.out.println(res);*/

	}

}

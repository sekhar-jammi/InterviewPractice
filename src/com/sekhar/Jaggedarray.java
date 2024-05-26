package com.sekhar;

public class Jaggedarray {

	public static void main(String[] args) {
		int [][] jdarray=new int[2][];
		jdarray[0]=new int[3];
		jdarray[1]=new int[4];
		int counter=0;
		for(int row=0;row<jdarray.length; row++) {
		   for (int col=0;col<jdarray[row].length;col++) {
			    jdarray[row][col]=counter++;
		   }
		   }
		for(int row=0;row<jdarray.length;row++) {
			System.out.println();
			for(int col=0; col<jdarray[row].length;  col++) {
				System.out.println(jdarray[row][col]+" ");
			
			}
		}
	}

}

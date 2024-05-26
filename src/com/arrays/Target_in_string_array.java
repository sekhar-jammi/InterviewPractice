package com.arrays;

public class Target_in_string_array {

	public static void main(String[] args) {
		String[] strarray=new String[] {"one","two","three","four"};
		String target="three";
		for(int i=0;i<strarray.length;i++) {
			if(strarray[i].equals(target)){
				System.out.println("target string element found at index"+i);
				
			}
		}

	}

}

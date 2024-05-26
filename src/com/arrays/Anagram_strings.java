package com.arrays;

import java.util.Arrays;

public class Anagram_strings {

	public static void main(String[] args) {
		String str="Dusty";
		String str2="Study";
		
		str=str.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str.length()==str2.length()) {
			
			char[] strchararray=str.toCharArray();
			char[] str2chararray=str2.toCharArray();
			
			Arrays.sort(strchararray);
			Arrays.sort(str2chararray);
			
			boolean result=Arrays.equals(strchararray,str2chararray);
			
			if(result) {
				System.out.println(str+ " and " +str2+ " are anagrams ");
			}
			else {
				System.out.println("not anagrams");
			}
		}
		else {
			System.out.println("not anagrams");
		}
		
	}

}

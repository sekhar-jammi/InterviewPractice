package com.sekhar2;

public class PermutationsOfString {

	   static void permutations(String str1, String str2) {
		      // checking  if the string is null or empty
		        if(str1.length()==0) {
		        	System.out.println(str2 + " ");
		        	return;
		        }
		        for(int i=0; i<str1.length();i++) {
		        	// ith character of string.
		        	char ch=str1.charAt(i);
		        	//rest of the string after excluding ith character.
		        	String str3=str1.substring(0,i)+str1.substring(i+1);
		        	// recursive call
		        	permutations(str3,str2+ch);
		        }
	   
		      }
	   
	
	   public static void main(String[] args) {
		      String str1="cat";
		      permutations(str1,"");
		

	}

}

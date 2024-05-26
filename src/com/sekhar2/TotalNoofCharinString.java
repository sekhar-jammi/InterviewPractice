package com.sekhar2;

import java.util.Scanner;

public class TotalNoofCharinString {

	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Eneter the string:");
	       String str=sc.nextLine();
	       
	       int count=0;
	       System.out.println("string for counting characters:"+str);
	       
	       for(int i=0;i<str.length();i++) {
	    	   if(str.charAt(i)!=' ') 
	    		  count++; 
	    	   
	       }
	       System.out.println("Total number of characters in string:"+count);
	       

	}

}

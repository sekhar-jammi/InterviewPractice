package com.arrays;

public class Max_min_in_array {

	public static void main(String[] args) {
	       int [] a= {10,56,2,6,78,97,100,1};
	       
	       int max=a[0];
	       int min=a[0];
	       
	       for(int i:a) {
	    	   if(i>max) {
	    		   max=i;
	    	   }
	          else if( min>i) {
	        	  min=i;
	        	  
	          }	   
	    	   }
	       
	       System.out.println(max);
	       System.out.println(min);
	       }
	
	}



package com.Exceptions;

public class Example3 {

	public static void main(String[] args) {
	       try {
	    	   System.out.println("Hai");
	    	   System.out.println(99/0);
	       }
	       catch(ArithmeticException e) {
	    	   System.out.println("helllo");
	       }
	       catch(Exception e) {
	    	   System.out.println("hey");
	       }
	       finally {
	    	   System.out.print("welcome");
	    	   
	       }
	       System.out.println("have a nice day");
	}  

}

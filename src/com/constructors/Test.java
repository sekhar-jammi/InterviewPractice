package com.constructors;

public class Test {
	Test() {
	      this(20);
	      System.out.println("One");
	   }
	  Test(int i) {
	      this(null); 
	      System.out.println("Two");	 
	    }
	  Test(Test test) {
	       System.out.println("Three");	  
	 }
	public static void main(String[] args) 
	{
	    new Test();
	 }
}

package com.inheritance;

public class Myclass extends Demo {
	   public void display() {
		   System.out.println("Abstract method.");
	   }
	   public static void main(String[]args) {
		      Demo obj =new Myclass();
		      obj.display();
	   }
	
}

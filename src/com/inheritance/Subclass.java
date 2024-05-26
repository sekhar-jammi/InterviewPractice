package com.inheritance;

public class Subclass extends Superclass{
	   public void displayResult() {
		   System.out.println("diplay from subclass.");
		   super.displayResult();
	   }
	   public static void main(String[]args) {
		      Subclass obj=new Subclass();
		      obj.displayResult();
	   }
     
}

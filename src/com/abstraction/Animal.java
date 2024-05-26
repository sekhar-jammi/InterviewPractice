package com.abstraction;

abstract class Animal {
	     abstract void walk();
	     void breathe() {
	    	 System.out.println("The animal breathes air.");
	     }
	     Animal(){
	    	 System.out.println("you are about to create animal.");
	     }

}

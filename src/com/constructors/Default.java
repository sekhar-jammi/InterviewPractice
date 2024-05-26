package com.constructors;

public class Default {
	   int num;
	   String name;
	   
	   Default(){
		   System.out.println("constructor is called");
	   }

	public static void main(String[] args) {
		Default def=new Default();
		System.out.println(def.num);
		System.out.println(def.name);
	

	}

}

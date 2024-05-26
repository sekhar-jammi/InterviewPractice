package com.constructors;

public class ConstructorChain {
	//default constructor  
	ConstructorChain()  
	{  
	this("sekhar");  
	System.out.println("Default constructor called.");  
	}  
	//parameterized constructor  
	ConstructorChain(String str)  
	{  
	System.out.println("Parameterized constructor called");  
	}  
	//main method  
	public static void main(String args[])   
	{   
	//initializes the instance of example class  
	ConstructorChain cc = new ConstructorChain();   
	}   
}

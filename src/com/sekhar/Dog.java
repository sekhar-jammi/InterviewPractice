package com.sekhar;

// Here Dog is a sub class that extending class Animal(superclass)
 class Dog extends Animal{
	 
	//sub class method 
	 public void display() {
		 System.out.println(" My name is " + name );
	 }
	 
     public static void main(String[] args) {
    	 
    	 //creating object of sub class(Dog)
    	 Dog labrador=new Dog();
    	 //Dog Goldenretriver=new Dog();
    	 
    	 // accessing super class variable
    	 labrador.name="Tommy";
    	// Goldenretriver.name="Rhino";
    	 
    	 //calling sub class method and super class method
    	 labrador.display();
    	 labrador.eat();
    	 
    	 
    	 //calling super class method using subclass object
    	// Goldenretriver.display();
    	// Goldenretriver.eat();
     }
}

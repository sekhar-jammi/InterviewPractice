package com.constructors;

public class Main {
	int my_sum;
	   Main() {
	      this(12, 30);
	   }
	   Main(int my_input_1, int my_input_2) {
	      System.out.println("The numbers are defined as " +my_input_1 +" and " +my_input_2);
	      this.my_sum = my_input_1 + my_input_2;
	   }
	   void display() {
	      System.out.println("The sum is: " + my_sum);
	   }
	public static void main(String[] args) {
		 Main my_object = new Main();
	      my_object.display();

	}

}

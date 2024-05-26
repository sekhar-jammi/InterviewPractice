package com.inheritance;

public class MethodExample {
       public void print() {
    	   System.out.println("method without parameters.");
       }
       public void print(String name ) {
    	   System.out.println("method with parameters.");
       }
       public static void main(String[] args) {
    	   MethodExample obj1=new MethodExample();
    	   MethodExample obj2=new MethodExample();
    	   
    	   obj1.print();
    	   obj2.print("sekhar");
       }
}

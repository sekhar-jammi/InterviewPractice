package com.inheritance;

public class Instancemethod {
       public static void main(String[] args) {
       Instancemethod obj=new Instancemethod();
       System.out.println("The sum is " +obj.add(12,13));
       }
       
       int s;
       public int add(int a, int b) {
    	      s=a+b;
    	      return s;
       }
}

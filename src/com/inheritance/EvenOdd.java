package com.inheritance;

import java.util.Scanner;

public class EvenOdd {
       public static void findEvenOdd(int num) {
    	   if(num%2==0) {
    		   System.out.println("Given number is even number.");
    	   }else {
    		   System.out.println("Given number is odd number.");
    	   }
    	   
       }
       public static void main(String[] args) {
    	   
    	      Scanner sc=new Scanner(System.in);
    	      System.out.println("Enter the nummber:");
    	      int num=sc.nextInt();
    	      findEvenOdd(num);
       }
}

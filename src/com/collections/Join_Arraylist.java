package com.collections;

import java.util.ArrayList;

public class Join_Arraylist {
       public static void main(String[] args) {
    	      ArrayList al = new ArrayList();
    	      
    	      al.add("a");
    	      al.add(1);
    	      al.add("b");
    	      System.out.println("Arraylist1 is:"+al);
    	      
    	      ArrayList al2= new ArrayList();
    	       al2.addAll(al);
    	       System.out.println(" Arraylist2 is"+al2);
    	      
       }
}

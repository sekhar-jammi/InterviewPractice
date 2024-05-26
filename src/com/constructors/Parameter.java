package com.constructors;

public class Parameter {
       int id;
       String name;
       
       Parameter(int id,String name){
    	   this.id=id;
    	   this.name=name;
       }
       
       public static void main(String[] args) {
    	      Parameter par= new Parameter(1,"sekhar");
    	      System.out.println(par.name);
    	      System.out.println(par.id);
    	   
    	   
       }
       
}

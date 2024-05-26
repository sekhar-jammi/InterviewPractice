package com.sekhar;

public class Programmer {

	//properties
		String name="sekhar";    
		String language="java";
	// method
        void programming() {
        	System.out.println(name+ " is a " + language + " programmer ");
        }
		public static void main (String[] args)	{
			Programmer p=new Programmer();
			p.programming();
		}
			
		
	}



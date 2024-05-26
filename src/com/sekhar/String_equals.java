package com.sekhar;

public class String_equals {

	public static void main(String[] args) {
	    String str1="java";
	    String str2="java";
	    String str3="JAVA";
	    String str4="JSP";
	    String str5=new String("java");
	    if(str1.equals(str2)) {
	    	System.out.println("Strings are equal");
	    }else {
	    	System.out.println("Strings are not equal");
	    }
	    if(str1.equals(str3)) {
	    	System.out.println("Strings are equal");
	    }else {
	    	System.out.println("Strings are not equal");
	    }
	    if(str1.equals(str4)) {
	    	System.out.println("Strings are equal");
	    }else {
	    	System.out.println("Strings are not equal");
	    }
	    if(str1.equals(str5)) {
	    	System.out.println("Strings are equal");
	    }else {
	    	System.out.println("Strings are not equal");
	    }
	    if(str1==str2) {
	    	System.out.println("Strings are equal");
	    }else {
	    	System.out.println("Strings are not equal");
	    }
	    
          
	}

}

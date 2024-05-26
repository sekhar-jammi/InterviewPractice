package com.sekhar2;

public class String_superclass {
    public static void main(String[] args) {
    	String_superclass obj=new String_superclass();
    	Class cls=obj.getClass().getSuperclass();
    	System.out.println(cls.getName());
    }
}

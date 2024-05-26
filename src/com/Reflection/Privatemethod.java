package com.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Privatemethod {
	//Access all private methods of the class.
	public void printAllPrivateMethods(Book book) throws IllegalAccessException, 
				IllegalArgumentException, InvocationTargetException {
		
             Method[] methods = book.getClass().getDeclaredMethods();
             for (Method method : methods) {
                if (Modifier.isPrivate(method.getModifiers())) {
            	   method.setAccessible(true);
            	   Object[] args = null;
            	   Object ob = method.invoke(book, args);
            	   System.out.println(method.getName()+" : "+ ob);
                }
             }
	}
	//Access private method by using method name.
	public void printMethodValue(Book book, String methodName) throws NoSuchMethodException, SecurityException,
				       IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	    Method method = book.getClass().getDeclaredMethod(methodName);
            if (Modifier.isPrivate(method.getModifiers())) {
        	method.setAccessible(true);
        	Object[] args = null;
        	Object ob = method.invoke(book, args);
        	System.out.println(methodName + " : "+ ob);
            }
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
		       InvocationTargetException, NoSuchFieldException, SecurityException, NoSuchMethodException {
		
		Book book = new Book("Spring Security", 15, 6);
		Privatemethod ob = new Privatemethod();
		//print all private methods and their return value
		ob.printAllPrivateMethods(book);
		System.out.println("-----------------------");
		//print private method return value by method name
		ob.printMethodValue(book, "getBookName");
	}
} 


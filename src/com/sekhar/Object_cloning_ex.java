package com.sekhar;

public class Object_cloning_ex implements Cloneable{
	int rollno;
	String name;
	Object_cloning_ex(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
		
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args) {
		try {
		Object_cloning_ex s1=new Object_cloning_ex(101,"sekhar");
		Object_cloning_ex s2=(Object_cloning_ex)s1.clone();
		
		System.out.println(s1.rollno+" "+s2.name);
		System.out.println(s2.rollno+" "+s2.name);
		}catch(CloneNotSupportedException c) {}
	}
	     

}

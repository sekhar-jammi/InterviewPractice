package com.sekhar2;

final class Immutable_class {
		   private  String empName;
		   private  int age;
		   public Immutable_class(String name, int age) {
			   super();
			   this.empName = name;
			   this.age = age;
		   }
		   public String getEmpName() {
			      return empName;
			   }
		   public int getAge() {
			      return age;
			   }
	
		   
		   public  static void main(String[] args) {
			   Immutable_class emp=new Immutable_class("aditya",26);
			   System.out.println(emp);
			   
		   }
	
	}
	




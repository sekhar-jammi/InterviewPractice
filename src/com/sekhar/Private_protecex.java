package com.sekhar;

public class Private_protecex implements Private_protec_inter{
	public void display() {
		System.out.println(" hai private modifiers are not allowed in interface");
	}

	public static void main(String[] args) {
		Private_protecex pp=new Private_protecex();
		pp.display();
		System.out.println(str);

	}

}

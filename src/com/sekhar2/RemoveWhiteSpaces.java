package com.sekhar2;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		   Scanner sc =new Scanner(System.in);
		   System.out.println("enter string:");
		   String str=sc.nextLine();
		   
		   System.out.println("original string:"+str);
		   
		   str=str.replaceAll("\\s","");
		   System.out.println("string after removing whitespaces:"+str);

	}

}

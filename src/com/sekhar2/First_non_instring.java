package com.sekhar2;

import java.util.HashMap;
import java.util.Scanner;

public class First_non_instring {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("enter string:");
		   String s1=sc.nextLine();
		   Character ch;
		   HashMap<Character,Integer> charcount = new HashMap<Character,Integer>();
		   for(int i=0; i<s1.length();i++) {
			   ch=s1.charAt(i);
			   if(charcount.containsKey(ch)) {
				   charcount.put(ch, charcount.get(ch)+1);
			   }else
				   charcount.put(ch,1);
		   }
		   for (int j=0;j<s1.length();j++) {
			   ch=s1.charAt(j);
			   if(charcount.get(ch)==1){
				   System.out.println("first non repeating character "+ch);
				   break;
			   }
                 
		   }
	}

}

package com.sekhar2;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		   String str="hi iam sekhar jammi";
		   int count=1;
		   for(int i=0; i<str.length()-1;i++) {
			   if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				   count++;
			   }
		   }
		   System.out.println("number of words in string:"+count);
	}

}

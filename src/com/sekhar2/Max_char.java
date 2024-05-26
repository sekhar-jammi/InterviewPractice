package com.sekhar2;

public class Max_char {

	public static void main(String[] args) {
		   String str="rajasekhar";
		   char maxchar=' ';
		   int max=-1;
		   int[] charfreq=new int[256];
		   for(int i=0; i<str.length();i++) {
			   charfreq[str.charAt(i)]++;
			   
		   }
		   for(int i=0;i<str.length();i++) {
			   char ch=str.charAt(i);
			   if(max<charfreq[ch]) {
				   max=charfreq[ch];
				   maxchar=ch;
			   }
		   }
		   System.out.println(maxchar);

	}

}

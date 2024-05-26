package com.Exceptions;

import java.io.IOException;

public class Exception5 {
	public static void jump(){
		   System.out.println("Dil jumping zapak jampak jampak");
		}

		public static void main(String args[]) {

		   try{
		      jump();
		   }
		  // catch(IOException e){
		      e.printStackTrace();
		   }

		}
}

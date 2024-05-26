package com.sekhar;

public class Finally {

	public static void main(String[] args) {
		try {
			System.out.println("iam in try block");
			//System.exit(0);
		}catch (Exception e){
			System.out.println("iam in catch block");
			System.exit(0);
		}finally {
			System.out.println("iam in finally block");
		}
			
		}
	}



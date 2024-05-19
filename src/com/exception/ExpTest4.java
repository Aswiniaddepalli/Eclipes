package com.exception;

import java.util.Scanner;

public class ExpTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan=new Scanner(System.in);
			while(true) {
				System.out.println("Enter the age:");
			int age=scan.nextInt();
			if(age<=18) 
				throw new RuntimeException("Your are not");
			else
				System.out.println("Your Applicaple");
			}
		}catch(Throwable e) {
			System.out.println(e.getMessage());
		}

	}

}

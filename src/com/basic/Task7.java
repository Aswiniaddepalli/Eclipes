package com.basic;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count of an 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		while(n>0) {
			int a=n%10;
					System.out.println(a);
					n=a;
					
		}
		

	}

}

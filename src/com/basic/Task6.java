package com.basic;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		System.out.println(n);
		int count=0;
		while (n>0) {
			 n=n/10;
			count++;
		}
		System.out.println(count);
		

	}

	
	}



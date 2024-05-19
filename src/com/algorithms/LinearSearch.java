package com.algorithms;
import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the elements of an array");
		for(int j=0;j<size;j++) {
			a[j]=sc.nextInt();
		}
		System.out.println("Enter the value");
		int val=sc.nextInt();
		//int n=a.length;
		int pos=-1;
		for(int i=0;i<size;i++) {
			if(a[i]==val) {
				pos=i;
				System.out.println(pos);
				//break;
			}
			
		}
		if(pos==-1) {
			System.out.println("Value not found");
		}
		
		
		
		

	}

}

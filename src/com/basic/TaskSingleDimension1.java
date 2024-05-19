package com.basic;

import java.util.Scanner;

public class TaskSingleDimension1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner s=new Scanner (System.in);
		 String arr[]= new String[10];
		 System.out.print("Enter element");
		 for(int i=0;i<arr.length;i++) {
			 
				arr[i]=s.nextLine();
				 System.out.print(arr[i]+i);
		 }*/
		 String arr[] = {"Aswini","sathya","priya","sri","Devi","Pethviusb"};
		int len=0;
		for(String arr1:arr) {
			if(arr1.length()>len)
				len=arr.length;
		}
		System.out.println();
		System.out.println(len);
				

	}

}

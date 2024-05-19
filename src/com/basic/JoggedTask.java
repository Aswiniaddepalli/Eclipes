package com.basic;

import java.util.Scanner;

public class JoggedTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] [] =new int[3][];
		for(int i=0;i<arr.length;i++)
			arr[i]=new int[arr.length+1-i];//declaring column
		
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Row ="+(i+1));
			for (int j=0;j<arr[i].length;j++) {
				System.out.print("Enter element");
				arr[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Data from jogged array");
		for (int row[] : arr) {
			for (int col : row) {
				System.out.print(col+" ");
				
			}
			System.out.println();
			
		}		

	}

}

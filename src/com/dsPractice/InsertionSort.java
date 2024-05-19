package com.dsPractice;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {1,7,5,6,8,3};
		int i,j,temp;
		int count=0;
		System.out.println("Before Sorting");
		//printing Before sort
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		//logic
		
		for(i=1;i<arr.length;i++) {
			temp=arr[i];
			j=i-1;
			while(arr[j]>temp&&j>=0) {
				arr[j+1]=arr[j];
				//System.out.println(arr[j+1]);
				j=j-1;
			}
			arr[j+1]=temp;
			System.out.println();
			System.out.println("After Sorting");
			for(int b:arr) {
				System.out.print(b+" ");
			}
		}
		

	}

}

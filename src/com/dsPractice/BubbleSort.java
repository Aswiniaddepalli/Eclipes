package com.dsPractice;

public class BubbleSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,3,5,1,7};
		int size=arr.length;
		
		System.out.println("Before sorting");
		for(int arr1:arr) {
			System.out.print(arr1+" ");
		}
		for(int a=arr.length-1;a>0;a--)
		{
			for(int j=0;j<a;j++)
			{
				if(arr[j]>arr[j+1])
				{
					sort(arr,j,j+1);
				}
			}
			System.out.println();
			System.out.println("After sorting");
			for(int num:arr) {
				System.out.print(num+" ");
			}
		}
		
		

	}
	public static void sort(int arr[],int i,int j) {
		if(arr[i]==arr[j]) {
			return;
		}
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}

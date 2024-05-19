package com.dsPractice;

public class BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,5,2,8,9,4};
		
		int size=arr.length;
		System.out.println("Befor sorting");
		for(int b:arr) {
			System.out.print(b+" ");
		}
		for(int i=0;i<size;i++) 
		{
			for(int j=0;j<size-i-1;j++) 
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}

	}

}

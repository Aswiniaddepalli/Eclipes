package com.dsPractice;

public class SelectionSort {

	public static void main(String[] args) {
		int nums[]= {12,8,3,5,2,9};
		int size=nums.length;
		int minIndex=0;
		int temp=0;
		System.out.println("Before Sort ");
		for(int a:nums) {
			System.out.print(a+" ");
		}
		//logic for selection sort
		for(int i=0;i<size-1;i++) {
			minIndex=i;
			for(int j=i+1;j<size;j++) {
				if(nums[minIndex]>nums[j])//minIndex=0,j=1
					minIndex=j;//minIndex=1
				System.out.println();
				System.out.print(minIndex+" ");
			}
			temp=nums[minIndex];//nums[minIndex(1)]=8 i.e.,temp=8
			nums[minIndex]=nums[i];//nums[i(0)]=12 i.e.,nums[minIndex(1)]=12
			nums[i]=temp;//temp=8 i.e.,nums[i(0)]=8
			//finally 
			//nums[minIndex]=12,nums[i(0)]=8
			System.out.println();
			System.out.println("After Sorting");
			for(int b:nums) {
				System.out.print(b+" ");
			}
		}
		

	}

}

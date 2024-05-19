package com.basic;

import java.util.Arrays;

public class ModifyingOfParticularData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,14,15,16,19};
		for (int n:arr) {
			System.out.println(n);
		}
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++) {
			//modifying internal data at a specific location
			if(arr[i]%4==0)
				arr[i]=arr[i]+1;
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}

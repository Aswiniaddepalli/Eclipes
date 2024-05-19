package com.basic;
import java.util.Arrays;
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,14,15,16,19};
		for (int n:arr) {
			System.out.println(n);
		}
		System.out.println("After sorting");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	

}



	


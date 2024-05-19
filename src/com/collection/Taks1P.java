package com.collection;

import java.util.ArrayList;

public class Taks1P {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
	
		int arr[]= {1,2,3,4};
		int arr1[] = {1,2,3,1};
		for (int a:arr) {
			list1.add(a);
		}
		for(int b:arr1 ) {
			list2.add(b);
		}
		list.addAll(list2);
		list.addAll(list1);
		for(int c:list) {
			System.out.print(list.get(c)); 
			
		}
	}

}

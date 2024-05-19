package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		//int[] arr1=new int[7];
		System.out.println("Enter the elements");
		for(int i=0;i<7;i++) {
			int num=sc.nextInt();
			list.add(num);	
		}
		list.addFirst(1);
		list.addLast(2);
		int s=list.size();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	
		System.out.println(list.remove(s/2));
		for(int d:list) {
			System.out.print(d+"  ");
		}
		
	}

}
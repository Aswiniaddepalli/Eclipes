package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest1 {
	public static void main(String[] args) {
		//ArrayList list=new ArrayList();
		//Conventional part of approach
		ArrayList<Number> list=new ArrayList<>();
		int arr[]= {10,20,30,40,50,20};
		
		String names[]= {"Neena","Raju","Balu","Abdul"};
		for (int a:arr) {
			list.add(a);
		}
//		for(String name:names) {
//			list.add(name);
//		}
		list.remove(5);
		
		Double d=345.6;
		
		list.set(2, d);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		Iterator<Number> itr=list.iterator();   //hasNext(),next() are methods of iterator
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			//break;
		}  
	}

}

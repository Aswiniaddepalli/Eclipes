package com.ds;

public class InsertionSort {
	void insert(int a[]) {
		int i,j,temp;
		for(i=1;i<a.length;i++) {
			temp=a[i];
			j=i-1;
			
			while(j>=0 && temp<=a[j]) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
	}
	void printArr(int a[]) {
		int i;
		for(i=0;i<a.length;i++) 
			System.out.printf("%d\n",a[i]);
			System.out.println(" ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,31,25,8,32,17};
		InsertionSort insert=new InsertionSort();
		System.out.println("before -\n");
		insert.printArr(a);
//		insert.insert(a);
		System.out.println("After-\n");
//		insert.printArr(a);
		insert.insert(a);
		insert.printArr(a);
		
	}

}

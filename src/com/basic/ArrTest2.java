package com.basic;

public class ArrTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multidimensional storage
		int arr[] []= {{10,20},{30,40},{50,60}};
		int rows=arr.length;
		int cols=arr[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println("Using for each loop");
		for (int r[]:arr) {
			for(int c:r)
				System.out.print (c+" ");
			System.out.println();
		}
	}

}

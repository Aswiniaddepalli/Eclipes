package com.basic;

public class Patterns_model {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++) {
			for (int j=0;j<i;j++)
			{
				if(j==0||j==2) {
					System.out.print("1 ");
				
				}
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		for(int i=4;i>=4;i++) {
			for (int j=0;j<i;j++)
			{
				if(j==0||j==2) {
					System.out.print("1 ");
				
				}
				else
					System.out.print("0 ");
			}
			System.out.println();
		}

	}

}

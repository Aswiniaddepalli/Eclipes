package practice;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name : ");
		String name =sc.nextLine();
		for(int i=0;i<name.length();i++) {
			for(int j=0;j<=i;j++) {
				
					System.out.print((name.charAt(j))+" ");
					}
				
			System.out.println();
					
			}
			
		}
	
	

	}



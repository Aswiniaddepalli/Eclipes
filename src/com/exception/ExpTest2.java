package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter numerator");
			int a=sc.nextInt();
			
			System.out.println("enter denominator");
			int b=sc.nextInt();
			
			int z=a/b;
			System.out.println("quotient"+z);
		}
		catch(ArithmeticException|InputMismatchException e) {
			if(e instanceof ArithmeticException) {
				System.out.println();
			}
		}
		/*catch(ArithmeticException ae){
			System.out.println("denominator cannot go zero");
			
		}
		catch(InputMismatchException ie ) {
			System.out.println("Integer expected");
		}*/
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("process completed");
		}

	}

}

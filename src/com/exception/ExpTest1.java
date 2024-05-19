package com.exception;

import java.util.Scanner;

public class ExpTest1 {

	public static void main(String[] args) {
		String text=null;
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		text=sc.nextLine();
		if(text.length()>=5)
			System.out.println("Welcome to "+text);
		else {
			text=null;
		System.out.println("length of the text is: "+text.length());
		}
		}
		catch(Exception ex){
			//4ways to write the exceptions
			System.out.println(ex);//1st way
			System.out.println(ex.getMessage());//2nd way
			System.out.println("value must be initialized for variable and length must be >= 5");//3rd way
			ex.printStackTrace();//4rth way
		}
		finally {
			System.out.println("program completed");
		}
		

	}

}

package com.basic;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s =new Scanner(System.in);
	        System.out.println("Enter the sentence");
	        String str = s.nextLine();
	        System.out.println(str);
	    System.out.println("Enter the word to find:");
	    
	        String str2 =s.nextLine();
	        boolean wordExists= str2.contains(str2);
	        String result =wordExists?"Word exist in the text":"Word does not exist in the text";
	        
	        System.out.println();
	       

	}

}

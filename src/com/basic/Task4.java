package com.basic;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = s.nextLine();
        System.out.println(str);
       
        System.out.println(str.startsWith("A"));
        System.out.println(str.endsWith("s"));
        System.out.println(str.contains("is"));
        
	}

}

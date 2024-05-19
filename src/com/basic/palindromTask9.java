package com.basic;

import java.util.Scanner;

public class palindromTask9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//palindrom string
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any word");
		String str=s.next();
		int len=str.length();
		int mid=len/2;
	    int m =mid;
	    int l=len-1;
	    boolean b=false;
	    for(int i=0;i<mid;i++) {
	    	if(str.charAt(i)==str.charAt(1)) {
	    		b=true;
	    		}
	    	else {
	    		b=false;
	    		break;
	    		
	    	}
	    	l--;
	    }
	    if(b==false) {
	    	System.out.println("not palindrom");
	    }
	    else {
	    	System.out.println("palindrome");
	    		
	    	
	    }

	}

	

}

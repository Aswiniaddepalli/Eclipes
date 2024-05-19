package com.basic;

public class task2 {
public static void main(String[] args) {
	String str="This is my java code";
	/*System.out.println(str.equals("this is my java code"));
}
*/
	//System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	System.out.println(str.length());
	System.out.println(str.concat("Aswini"));
	System.out.println(str.lastIndexOf("m",9));
	char[] str1=str.toCharArray();
	System.out.println(str1[2]);
	System.out.println(str.indexOf("a"));
	System.out.println(str.lastIndexOf("",12));
} 
}

package practice;

import java.util.Scanner;
import java.util.*;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="AswiniAddepalli";
		int l=s.length();
		String s1=s.substring(0,l-4);
		System.out.println(s1.replaceAll(".","*")+s.substring(l-4));

	}

}

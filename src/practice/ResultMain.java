package practice;

import java.util.Scanner;

public class ResultMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the id:");
		int id=(new Scanner(System.in)).nextInt();
		System.out.println("Enter the name:");
		String name=(new Scanner(System.in)).nextLine();
		System.out.println("Enter the subject1 marks:");
		int s1=(new Scanner(System.in)).nextInt();
		System.out.println("Enter the subject2 marks:");
		int s2=(new Scanner(System.in)).nextInt();
		Result s=new Result(id,name,s1,s2);
		s.display();
		

	}

}

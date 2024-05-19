package com.exception;

public class ExcTest5 {
	public static int divideNumbers(int n,int d)throws ArithmeticException{
		int res=0;
		if(d==0)
			throw new ArithmeticException("Denominator cannot be zero");
		else
			res=n/d;
		return res;
	}
	public static void main(String[] args) {
		try {
			int x=divideNumbers(10,0);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Completed");
		}
	}

}

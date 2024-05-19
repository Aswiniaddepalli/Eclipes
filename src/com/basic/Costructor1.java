package com.basic;

public class Costructor1 {
	private String message;
	public  Costructor1(){
		message="welcom to all"; 
	}
	public Costructor1(String message) {
		this.message=message;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Costructor1 obj=new Costructor1("tested");
		System.out.println(obj.message);
		}

	}



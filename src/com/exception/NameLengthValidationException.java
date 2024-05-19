package com.exception;

public class NameLengthValidationException extends RuntimeException{
	public NameLengthValidationException() {
		
		// TODO Auto-generated constructor stub
		super ("Invalid name length");
	}
	public NameLengthValidationException(String message) {
		super(message);
		
	}
	

}

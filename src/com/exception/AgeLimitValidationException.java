package com.exception;

public class AgeLimitValidationException extends RuntimeException{
	public AgeLimitValidationException() {
		// TODO Auto-generated constructor stub
		super("Invalid Age");
	}
	public AgeLimitValidationException(String message) {
		super(message);
	}

}

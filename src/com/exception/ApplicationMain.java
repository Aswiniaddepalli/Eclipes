package com.exception;

public class ApplicationMain {
	public boolean validate(String name ,int age) throws NameLengthValidationException,AgeLimitValidationException{
		boolean bl=false;
		if(name.length()>=5)
			bl=true;
		else
			throw new NameLengthValidationException("Name length  is below expected range");
		if(age>18)
			bl=true;
		else
			throw new AgeLimitValidationException("Age limit is not reached");
		return bl;
	}
	public static void main(String[] args) {
		ApplicationMain app=new ApplicationMain();
		try {
		if(app.validate("sony",20))
			System.out.println("validation successful");
		else
			System.out.println("Validation failed");
	
			}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Thankyou for using this resource");
		}

		}
	}

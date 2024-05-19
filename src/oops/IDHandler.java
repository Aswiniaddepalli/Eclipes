package oops;
class EmployeeIDValidator extends IDValidator
{

	@Override
	public boolean validate()
	{
	// TODO Auto-generated method stub
		boolean bl=false;
		if(getId().length()==8) 
		{
			if(getId().charAt(0)=='E' && getId().charAt(1)==':')
			bl=true;
			else
			bl=false;
		}
		else
		bl=false;
		return bl;
	}
}
class AccountIDValidator extends IDValidator
{

	@Override
	public boolean validate() 
	{
		// TODO Auto-generated method stub
		String digits[]= {"4562","8893","9023"};
		boolean bl=false;
		if(getId().length()==16) 
		{
			for(String digit:digits) 
			{
				if(getId().substring(0,4).equals(digit))
				{
					bl=true;
					break;
				}
			}
		}
		return bl;
	
	}
	
}



public class IDHandler {
	public static void main(String[] args) {
		EmployeeIDValidator empValidate=new EmployeeIDValidator();
		empValidate.setId("E:123456");
		System.out.println(empValidate.validate());
		AccountIDValidator account =new AccountIDValidator();
		account.setId("9023567890123456");
		System.out.println(account.validate()?"valid account":"Invalid account");
		
		
	}
}


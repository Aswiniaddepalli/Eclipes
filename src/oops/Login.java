package oops;

import java.util.Scanner;

public class Login implements MessageService, UserLogin {

	@Override
	public boolean validatePassword(String password) {
		// TODO Auto-generated method stub
		boolean flag =false;
		if((password.charAt(0)>=65 && password.charAt(0)<=90) && password.contains("@")&& password.length()==8)
		flag=true;
		return flag;
	}

	@Override
	public String invitation(String user) {
		// TODO Auto-generated method stub
		return "welcome to"+user;
	}

	@Override
	public boolean validateUser(String username) {
		// TODO Auto-generated method stub
		return username.length()<=8;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username,password;
		int attempt =0;
		boolean bl=false;
		Login login=new Login();
		while(true) {
			System.out.println("Enter username");
			username=(new Scanner(System.in)).nextLine();
			System.out.println("Enter password:");
			password =(new Scanner(System.in)).nextLine();
			if(login.validateUser(username)&& login.validatePassword(password)) {
				bl=true;
				break;
			}
			else {
				attempt++;
			}
			if(attempt==ATTEMPTS)
				break;
		}
		if(bl==true) {
			System.out.println(login.invitation(username));
		}
		else {
			System.out.println("Login failed");
		}
		

	}

}

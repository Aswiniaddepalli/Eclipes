package oops;

public interface UserLogin {
	int ATTEMPTS=3;
	boolean validateUser(String Username);
	boolean validatePassword(String password);

}

package oops;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest1 {
	public static void main(String[] args) {
		//1st
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("has");
		boolean b=m.matches();
		//2nd
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		//3rd
		boolean b3=  Pattern.matches("s", "as");
		System.out.println(b3);
		
	}

	

}

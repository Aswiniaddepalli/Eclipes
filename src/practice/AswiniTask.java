package practice;
import java.util.Arrays;
import java.util.Scanner;
import java.nio.charset.Charset;

public class AswiniTask {

	public static void main(String[] args) {
		
		String name="Pravalli08754ka";
		char s[]=new char[name.length()];
		
	
		for(int i=0;i<name.length();i++)
		{
			s[i]=name.charAt(i);
		}
		System.out.println();
		
		Arrays.sort(s);
		for(char a:s)
			System.out.print(a+" ");

		
	}

}

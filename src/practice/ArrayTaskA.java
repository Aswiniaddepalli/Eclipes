package practice;
import java.util.*;
public class ArrayTaskA 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String names[]= {"Aswini","Priyanka","Sravanthi","Shiva"};
		int name[]=new int[names.length];
	 	for(int i=0;i<names.length;i++)
	 	{
	 		name[i]=names[i].length();
	 	}
	 	int t=names.length;
	 	int cnt=0;
	 	for(int i=0;i<t;i++) {
	 		 cnt=Math.max(cnt,names[i].length());
	 	}
	 	for(int i=0;i<t;i++) {
		 if(names[i].length()==cnt) {
			 System.out.println(names[i]);
		 }
		 if(names[i].length()==5) {
			 System.out.println(names[i]);
		 }
		 if(names[i].charAt(0)=='S') {
			 System.out.println(names[i]);
		 }
	  }
	}
}



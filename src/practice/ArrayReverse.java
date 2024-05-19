package practice;



public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Aswini","Pravali"};
		int cnt=0;
		for(int i=0;i<names.length;i++) {
			int l=names[i].length();
			 cnt=Math.max(cnt, l);
			 
		}
		System.out.println(cnt);
		for(int i=0;i<names.length;i++) {
			if(cnt==names[i].length())
				System.out.println(names[i]);
		}
		java.util.Arrays.sort(names);
		System.out.println(names[0]);

	}

}

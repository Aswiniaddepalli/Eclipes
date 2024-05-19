package practice;

public class Static {
	int a=10;
	static int b=20;
	static void add(Static s) {
		//Static s=new Static();
		int c=s.a+b;
		System.out.println(c);
	}
	

}
class StaticMain{
	public static void main(String[] args) {
		Static sc=new Static();
		sc.a=10;
		sc.b=20;
		sc.a=20;
		Static.add(sc);
	}
}

package practice;

public class SubjectScore extends Student
{
	
	private int s1;
	private int s2;
	public SubjectScore( int id,String name,int s1,int s2) {
		// TODO Auto-generated constructor stub
		super(id,name);
	this.s1=s1;
	this.s2=s2;
	}
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	public void display() {
		super.display();
		System.out.println("Subject1:"+s1+"subject2 :"+s2);
	}

}

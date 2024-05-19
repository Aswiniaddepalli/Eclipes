package practice;

public class Result extends SubjectScore {
	private int total;
	private double Average;

	public Result(int id, String name, int s1, int s2) {
		super(id, name, s1, s2);
		this.total=s1+s2;
		this.Average=total/2;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return Average;
	}

	public void setAverage(double average) {
		Average = average;
	}
	public void display() {
		super.display();
		
		System.out.println("total:"+total+"\nAverage"+Average);
	}
	
}

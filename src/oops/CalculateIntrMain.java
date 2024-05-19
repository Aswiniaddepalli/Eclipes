package oops;
class SimpleIntr implements IntrestCalculator{

	@Override
	public double calcIntr(long pAmount, int terms, double rate) {
		// TODO Auto-generated method stub
		return pAmount+((pAmount*terms*rate)/100);
	}
class CompoundIntr implements IntrestCalculator{

	@Override
	public double calcIntr(long pAmount, int terms, double rate) {
		// TODO Auto-generated method stub
		double iamount=pAmount*Math.pow(1+rate/100, terms);
		return iamount;
	}
	
}
	
}

public class CalculateIntrMain  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

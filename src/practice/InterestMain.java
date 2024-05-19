package practice;


public class InterestMain extends InterestCalculator {

	@Override
	public void calcInterest() {
		// TODO Auto-generated method stub
		double interest =getAmount()*getTerm()*getRate();
		
	}

	@Override
	public void simpleInterest() {
		// TODO Auto-generated method stub
		double sInterest=(getAmount()*getTerm()*getRate())/100;
		
		
	}

	@Override
	public void compoundInterest() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		InterestMain sc=new InterestMain();
		
	}

}

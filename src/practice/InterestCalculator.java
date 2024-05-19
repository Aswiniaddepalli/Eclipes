package practice;

public abstract class InterestCalculator {
	long amount;
	int term;
	double rate;
	
	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public abstract  void calcInterest();
	public abstract void simpleInterest();
	public abstract void compoundInterest();
	
		

}

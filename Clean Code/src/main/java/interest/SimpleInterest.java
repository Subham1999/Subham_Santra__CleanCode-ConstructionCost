package interest;
/*
 * Simple Interest
 * Total amount = amount X ( 1 + rate_of_interest*number_of_year/100) 
 */
public class SimpleInterest extends Interest{
	public SimpleInterest() {
	}
	public SimpleInterest(double amount, double rateOfInterest, int numberOfIncrementPerYear, int numberOfYear ) {
		this.amount = amount;
		this.numberOfIncrementPerYear = numberOfIncrementPerYear;
		this.rateOfInterest = rateOfInterest/100.00;
		this.numberOfYear = numberOfYear;
	}
	protected double getInterest() {
		return this.amount*this.rateOfInterest*this.numberOfIncrementPerYear*this.numberOfYear;
	}
	@Override
	public double getTotalAmount() {
		return this.amount + getInterest();
	}
}

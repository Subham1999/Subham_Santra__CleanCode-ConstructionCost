package interest;
/*
 * Compound Interest
 * Total amount = amount X (1 + rate_of_interest/100)^number_of_year
 *  
 */
public class CompoundInterest extends Interest{
	public CompoundInterest() {}
	public CompoundInterest(double amount, double rateOfInterest, int numberOfIncrementPerYear, int numberOfYear) {
		this.amount = amount;
		this.numberOfIncrementPerYear = numberOfIncrementPerYear;
		this.rateOfInterest = rateOfInterest/100.00;
		this.numberOfYear = numberOfYear;
	}
	@Override
	public double getTotalAmount() {
		double product = 1;
		for(int i = 1; i <= this.numberOfYear*this.numberOfIncrementPerYear; i++) {
			product *= ( 1 + this.rateOfInterest/this.numberOfIncrementPerYear);
		}
		return this.amount*product;
	}
}

package interest;

public abstract class Interest {
	double rateOfInterest;
	double amount;
	int numberOfIncrementPerYear;
	int numberOfYear;
	public abstract double getTotalAmount();
}


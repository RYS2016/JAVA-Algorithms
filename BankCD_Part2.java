public class BankCD {

	private String bankName;
	private int initialDeposit;
	private double rate;
	private int numberOfYears;

	public BankCD(String bankName) {
		this.bankName = bankName;
	}

	public void setInitialDeposit(int deposit) {
		initialDeposit = deposit;
	}	
	public void setRate (double newRate) {
		rate = newRate;
	}	
	public void setNumberOfYears(int years) {
		numberOfYears = years;
	}


	public String getName () {
		return bankName;
	}
	public int getInitialDeposit () {
		return initialDeposit;
	}	
	public double getRate() {
		return rate;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}

	public double getFinalValue () {

		double finalValue;

		finalValue = initialDeposit * Math.pow((1 + (rate * 0.01)), numberOfYears);

		return finalValue;		
	}

	public void printCDDetails () {

		System.out.println(bankName + " " + numberOfYears + "-year CD of $5000 at " + rate + "% rate is worth $" + String.format("%.2f", getFinalValue()));
	}

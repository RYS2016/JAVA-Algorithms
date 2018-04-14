public class BankingProceduralStyle {

	public static void main(String[] args) {
		
		double bankA = test(5000, 0.04, 3);
		double bankB = test(5000, 0.03, 4);

		System.out.println("BankA 3-year CD of $5000 at 4.00% rate is worth $" + String.format("%.2f", bankA));
		System.out.println("BankB 4-year CD of $5000 at 3.00% rate is worth $" + String.format("%.2f", bankB));

		if (bankA > bankB) {
			System.out.println("BankA's CD exeeds BankB's CD by $" + (bankA - bankB));
		} else {
			System.out.println("BankB's CD exeeds BankA's CD by $" +  String.format("%.2f", (bankB - bankA)));
		}
	}	
	public static double test (int initialDeposit, double r, int t) {

		double finalValue;

		finalValue = initialDeposit * Math.pow((1 + r), t);

		return finalValue;		
	}
}

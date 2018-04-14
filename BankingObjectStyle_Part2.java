public class BankingObjectStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCD bank1CD = new BankCD("bankA");
		BankCD bank2CD = new BankCD("bankB");

		bank1CD.setInitialDeposit(5000);
		bank1CD.setNumberOfYears(3);
		bank1CD.setRate(4.00);

		bank2CD.setInitialDeposit(5000);
		bank2CD.setNumberOfYears(4);
		bank2CD.setRate(3.00);

		bank1CD.printCDDetails();
		bank2CD.printCDDetails();

		if (bank1CD.getFinalValue() > bank2CD.getFinalValue()) {
			System.out.println("BankA's CD exeeds BankB's CD by $" + (bank1CD.getFinalValue() - bank2CD.getFinalValue()));
		} else {
			System.out.println("BankB's CD exeeds BankA's CD by $" +  String.format("%.2f", (bank2CD.getFinalValue() - bank1CD.getFinalValue())));
		}

	}

}

import javax.swing.JOptionPane;

public class Demonetize {
	public static void main (String[] args ) {
		
		System.out.println("Hello User!");		
		
		int  thousands, fiveHundreds, totalAmount;
		
		String input1= JOptionPane.showInputDialog("Promt the number of old 1000 notes you have:");
		thousands = Integer.parseInt(input1);	
		String input2 = JOptionPane.showInputDialog("Show the number of your old 500 notes available, please!");
		fiveHundreds = Integer.parseInt(input2);
		
		totalAmount = (thousands * 1000) + (fiveHundreds * 500);
		System.out.println("Requested Conversion Amount = " + totalAmount);
		
		int newTwoThousands, newFiveHundreds, remainingAmount;
		
		newTwoThousands = totalAmount / 2000;		 
		System.out.println("New 2000 notes = " + newTwoThousands + ",");
		remainingAmount = totalAmount % 2000;
		System.out.println("Ramaining amount = " + remainingAmount);
		newFiveHundreds =  remainingAmount / 500;
		System.out.println("New 500 notes = " + newFiveHundreds);
		
		JOptionPane.showMessageDialog(null, 
				"Requested Amount (" + totalAmount + ")" 
				+ "\nNew 2000's (" + newTwoThousands + ")" 
				+ "\nNew 500'S (" + newFiveHundreds + ")");

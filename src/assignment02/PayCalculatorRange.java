package assignment02;
import javax.swing.JOptionPane;

public class PayCalculatorRange {

	public static void main(String[] args) {
		int wage = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter hourly rate of pay..."));
		int hours = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter hours worked..."));		
		int gross_pay = wage * hours;
		float tax_rate = 10f;
		if (gross_pay > 450) {
			if (gross_pay > 600) {
				if (gross_pay > 1000) tax_rate = 0.2f;
				else tax_rate = 0.15f;
			}
			else tax_rate = 0.12f;
		}
		float withholding_tax = gross_pay * tax_rate;
		float net_pay = gross_pay - withholding_tax;
		JOptionPane.showMessageDialog(null, "Hours worked: " + hours
		+ "\nPay rate: $" + wage + "/hr"
		+ "\nGross pay is: $" + gross_pay 
		+ "\nTax rate: " + Float.toString(tax_rate).substring(2) + "%"
		+ "\nWithholding tax is: $" + String.format("%.1f", withholding_tax)
		+ "\nNet pay is: $" + net_pay);
	}

}

package assignment02;
import javax.swing.JOptionPane;

public class PayCalculator {

	public static void main(String[] args) {
		int wage = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter hourly rate of pay..."));
		int hours = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter hours worked..."));		
		int gross_pay = wage * hours;
		int withholding_tax = gross_pay <= 450 ? gross_pay/10 : gross_pay/100*15;
		int net_pay = gross_pay - withholding_tax;
		JOptionPane.showMessageDialog(null, "Hours worked: " + hours
		+ "\nPay rate: $" + wage + "/hr"
		+ "\nGross pay is: $" + gross_pay + 
		"\nWithholding tax is: $" + withholding_tax +
		"\nNet pay is: $" + net_pay);
	}

}

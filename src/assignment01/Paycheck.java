package assignment01;
import javax.swing.JOptionPane;

public class Paycheck {

	public static void main(String[] args) {
		int wage = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter hourly rate of pay..."));
		int hours = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter hours worked..."));		
		int gross_pay = wage * hours;
		int withholding_tax = gross_pay/10;
		int net_pay = gross_pay - withholding_tax;
		JOptionPane.showMessageDialog(null, "Gross pay is: " + gross_pay + 
				"\nWithholding tax is: " + withholding_tax +
				"\nNet pay is: " + net_pay);
	}

}

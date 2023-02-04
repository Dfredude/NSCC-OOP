import javax.swing.JOptionPane;

public class BankTest {
	public static void main(String[] args) {
		// Write a java application that prompts a user for a balance
		
		String strBalance = JOptionPane.showInputDialog(null, "Enter a balance");
		
		// Typecasting to integer
		int balance = Integer.parseInt(strBalance);
		
		if (balance < 0) {
			System.out.println("overdraft");
		} else {
			if (balance == 0) {
				System.out.println("empty");
			} else {
				if (balance < 50) {
					System.out.println("too low");
				} else {
					if (balance < 100) {
						System.out.println("low");
					} else {
						System.out.println("OK. Your balance is: " + balance);
					}
				}
			}
		}
	}
}

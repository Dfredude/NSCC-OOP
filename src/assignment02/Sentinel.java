package assignment02;
import javax.swing.JOptionPane;

public class Sentinel {

	public static void main(String[] args) {
		int option;
		String intro = "Enter a number from 1-4...\n"
				+ "4 - Exit program";
		while (true) {
			try {
				option = Integer.parseInt(JOptionPane.showInputDialog(intro));
				if (option > 4 || option < 0) throw new RuntimeException("Number out of range");
				if (option == 4) break;
				JOptionPane.showMessageDialog(null, "Thank you!");
			} catch (RuntimeException e) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number! 1, 2, 3 or 4.", "Alert", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}

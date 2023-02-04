package assignment01;

import javax.swing.JOptionPane;

public class CustomArea {
	static int length = 0;
	static int width = 0;
	public static void main(String[] args) {
		width = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter width: "));
		length = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter length: "));
		int area = length * width;
		JOptionPane.showMessageDialog(null, "You have " + area + " meters square of area");
	}

}

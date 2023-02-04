import javax.swing.JOptionPane;

public class ForTest {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			String strInput = JOptionPane.showInputDialog(null, "Enter a num");
			Integer.parseInt(strInput);
		}

	}

}

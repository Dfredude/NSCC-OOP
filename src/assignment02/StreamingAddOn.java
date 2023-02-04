package assignment02;
import javax.swing.JOptionPane;


public class StreamingAddOn {

	public static void main(String[] args) {
		String subscriptions[] = {"Ad-Supported", "Basic", "Standard"};
		String choice = JOptionPane.showInputDialog("Welcome to this program to determine your streaming service subscription."
				+ "\nPlease enter your selection (1,2 or 3):"
				+ "\n1." + subscriptions[0]
				+ "\n2." + subscriptions[1]
				+ "\n3." + subscriptions[2]);
		String add_on = JOptionPane.showInputDialog("Do you widh to add an add-on to allow users outside their household ($7.99)?");
		boolean add_on_bool = add_on.startsWith("y") ? true : false;
		
		int choice_parsed = Integer.parseInt(choice);
		float price = 0;
		switch (choice_parsed) {
		case 1:
			price = 9.99f; break;
		case 2:
			price = 16.99f; break;
		case 3:
			price = 24.99f; break;
		}
		String output = "Your selection...\n"
		+ "Subscription: " + subscriptions[choice_parsed-1]
		+ (add_on_bool ? "\n • Add-on included" : "")
		+ "\nTotal: $" + (price + (add_on_bool ? 7.99f : 0));
		JOptionPane.showMessageDialog(null, output);
	}

}

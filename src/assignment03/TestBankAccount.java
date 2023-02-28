package assignment03;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		System.out.println("Empty Constructor:");
		System.out.println("Account number: " + b.getAccount_number());
		System.out.println("Balance: " + b.getBalance());
		System.out.println("First name: " + b.getFirst_name());
		System.out.println("Last name: " + b.getLast_name());
		System.out.println("Address: " + b.getAddress());
		b.setAccount_number(32);
		b.setAddress("434 George st");
		b.setFirst_name("John");
		b.setLast_name("Doe");
		System.out.println("Fields after setting them...");
		b.display();
		
	}

}

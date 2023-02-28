package assignment03;

//		A BankAccount has fields that hold the
//		account number
//		the customer's name (2 fields)
//		address
//		balance
//
//		Create the accessor and mutator methods for each attribute.
//		The class will also contain methods to deposit and withdraw an amount (internally updating the stored balance by the amount deposited or withdrawn).
//
//		Create a default constructor to default any numeric attribute to 2 and any string attribute to "empty".
//
//		Create another constructor to allow you to set all attributes stored within the object when the
//		object is declared.
//
//		Create a third constructor that allows you set all string attributes when the object is declared and defaults all the numeric attributes to 2.
//
//		Create a display function to show the class's current state.
//
//		Create a class named TestBankAccount and test all methods you created for your BankAccount class.

public class BankAccount {

	int account_number;
	String first_name;
	String last_name;
	String address;
	int balance;
	
	
	public BankAccount() {
		this.account_number = 2;
		this.first_name = "empty";
		this.last_name = "empty";
		this.address = "empty";
		this.balance = 2;
	}
	
	public BankAccount(int account_number, String first_name, String last_name, String address, int balance) {
		this.account_number = account_number;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.balance = balance;
	}
	
	public BankAccount(String first_name, String last_name, String address) {
		this.account_number = 2;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.balance = 2;
	}
	
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int amount) {
		this.balance += amount;
	}
	public int withdraw(int amount) {
		return this.balance -= amount;
	}

	public void display(){
		System.out.println("Hello " + getFirst_name() + " " + getLast_name());
		System.out.println("Account number: " + getAccount_number());
		System.out.println("Current Balance: " + getBalance());
		System.out.println("Current address: " + getAddress());
	}
}

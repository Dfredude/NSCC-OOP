package assignment03;

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
}

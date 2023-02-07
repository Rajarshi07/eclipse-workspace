package day5;

public class BankB extends Bank {

	public BankB() {
		// TODO Auto-generated constructor stub
	}
	public void deposit(double b) {
		this.balance=b;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		System.out.println("BANK B");
		return balance;
	}

}

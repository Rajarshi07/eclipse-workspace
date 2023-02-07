package day5;

public class BankA extends Bank {

	public BankA() {
		// TODO Auto-generated constructor stub
	}
	public void deposit(double b) {
		this.balance=b;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		System.out.println("BANK A");
		return balance;
	}

}

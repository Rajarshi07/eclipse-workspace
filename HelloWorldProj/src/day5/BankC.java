package day5;

public class BankC extends Bank {

	public BankC() {
		// TODO Auto-generated constructor stub
	}
	public void deposit(double b) {
		this.balance=b;
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		System.out.println("BANK C");
		return balance;
	}

}

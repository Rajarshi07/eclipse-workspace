package day6_collections;

public class Account {
	private double balance = 10000;

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amt) {
		this.balance -= amt;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", getClass()=" + getClass() + "]";
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

}

package day5;

public class TesterBank {

	public TesterBank() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank a=new BankA();
		Bank b=new BankB();
		Bank c=new BankC();
		a.deposit(500);
		b.deposit(200);
		c.deposit(100);
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
		System.out.println(c.getBalance());
		
	}

}

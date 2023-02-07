package day6_collections;

public class AccountTester {

	public AccountTester() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Account a1=new Account();
		AccountHolder ah=new AccountHolder(a1);
		Thread t1=new Thread(ah);
		Thread t2=new Thread(ah);
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
	}
}

package day6_collections;

public class AccountHolder implements Runnable{
	Account a;
	
	public AccountHolder(Account a) {
		super();
		this.a = a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			makeWithdrawal(i*500.0);
			if(a.getBalance()<0)System.out.println("Overdrawn");
		}
		
	}
	public synchronized void makeWithdrawal(double amt) {
		String name=Thread.currentThread().getName();
		System.out.println(name+ " withdraw "+amt+" from "+a);
		if(a.getBalance()>=amt) {
			a.withdraw(amt);
			System.out.println(amt+" withdrawn by "+name);
		}else {
			System.out.println("Amt not available for withdrawal for "+name);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
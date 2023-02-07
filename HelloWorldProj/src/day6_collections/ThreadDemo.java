package day6_collections;

class MyThread implements Runnable {

	public MyThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Value of i is " + i);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}

class ThreadClass extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		for (int j = 0; j < 10; j++) {
			System.out.println(this.getName()+" Value of j is " + j);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}

public class ThreadDemo {

	public ThreadDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Thread thr1 = new Thread(t1);
		ThreadClass t3 = new ThreadClass();
		thr1.start();
		t3.start();
		try {
			thr1.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

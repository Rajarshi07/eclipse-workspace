package day5;

public class ImplementInterface implements InterTwo,InterThree {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		InterThree.super.welcome();
	}

	public ImplementInterface() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ImplementInterface a=new ImplementInterface();
		a.show();
		a.print();
		a.display();
		a.welcome();
		System.out.println(InterOne.add(2, 5));
		System.out.println(InterOne.cube(5));
	}

}

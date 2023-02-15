package com.springcore.constructorInjection;

public class Addition {
	int x;
	int y;
	
	// constructor arrangement matters
	
	public Addition(String x, String y) {
		super();
		System.out.println("Addition Constructor: string,string");
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}

	
	public Addition(double x, double y) {
		super();
		System.out.println("Addition Constructor: double,double");
		this.x =(int) x;
		this.y =(int) y;
	}
	public Addition(int x, int y) {
		super();
		System.out.println("Addition Constructor: int,int");
		this.x = x;
		this.y = y;
	}
	
	public int doSum() {
		System.out.println("Value of x is: "+x);
		System.out.println("Value of y is: "+y);
		System.out.println("Sum is: "+(x+y));
		return x+y;
	}
	public Addition() {
		// TODO Auto-generated constructor stub
	}

}

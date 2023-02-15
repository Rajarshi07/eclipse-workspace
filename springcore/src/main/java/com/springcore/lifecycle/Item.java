package com.springcore.lifecycle;

public class Item {
	double price;
	
	public void init() {
		System.out.println("Init Item Method");
	}
	public void destroy() {
		System.out.println("Destroy Item Method");
	}
	public void destroy2() {
		System.out.println("Destroy2 Item Method");
	}

	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}


	public Item(double price) {
		super();
		System.out.println("Inside Item Constructor");
		this.price = price;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		System.out.println("Inside Item Price Setter");
		this.price = price;
	}


	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	
}

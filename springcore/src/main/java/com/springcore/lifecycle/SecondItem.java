package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SecondItem implements InitializingBean,DisposableBean{
	double price;
	
	@PostConstruct
	public void init() {
		System.out.println("Init Second Item Method");
	}

	@Override
	public String toString() {
		return "Second Item [price=" + price + "]";
	}


	public SecondItem(double price) {
		super();
		System.out.println("Inside Second Item Constructor");
		this.price = price;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		System.out.println("Inside Second Item Price Setter");
		this.price = price;
	}


	public SecondItem() {
		// TODO Auto-generated constructor stub
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init code goes here
		System.out.println("welcome, init done");
	}

	@PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy method running");
		
	}
	
	
}

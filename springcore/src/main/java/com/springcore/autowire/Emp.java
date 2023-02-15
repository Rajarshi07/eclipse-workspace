package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	String name;
//	@Autowired   // injects data without using setter or constructor.
	Address address;

	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + "]";
	}

//	@Autowired   // constructor autowiring
	public Emp(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	
	@Autowired    // setter autowiring
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

}

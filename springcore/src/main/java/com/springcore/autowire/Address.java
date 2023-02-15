package com.springcore.autowire;

public class Address {
	String street,city;
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

}

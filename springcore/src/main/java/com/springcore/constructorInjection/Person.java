package com.springcore.constructorInjection;

public class Person {
	int pId;
	String name;
	Certi cert;
	public Person(int pId, String name, Certi cert) {
		super();
		this.pId = pId;
		this.name = name;
		this.cert = cert;
	}


	@Override
	public String toString() {
		return "Person [pId=" + pId + ", name=" + name + ", cert=" + cert + "]";
	}


	public Person() {
		// TODO Auto-generated constructor stub
	}

}

package com.springcore.constructorInjection;

public class Certi {
	String name;
	

	@Override
	public String toString() {
		return "Certi [name=" + name + "]";
	}


	public Certi(String name) {
		super();
		this.name = name;
	}


	public Certi() {
		// TODO Auto-generated constructor stub
	}

}

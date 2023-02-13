package com.springcore.ref;

public class A {
	int id;
	B obj;
	public A(int id, B obj) {
		super();
		this.id = id;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", obj=" + obj + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	public A() {
		// TODO Auto-generated constructor stub
	}

}

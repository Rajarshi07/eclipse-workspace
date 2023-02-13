package com.springcore.ref;

public class B {
	int bid;
	

	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	@Override
	public String toString() {
		return "B [bid=" + bid + "]";
	}


	public B(int bid) {
		super();
		this.bid = bid;
	}


	public B() {
		// TODO Auto-generated constructor stub
	}

}

package day6_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GenericList <T> {
	ArrayList<T> l;

	public GenericList() {
		// TODO Auto-generated constructor stub
		this.l = new ArrayList<T>();
	}

	private void insert(T e) {
		// TODO Auto-generated method stub
		l.add(e);
//		System.out.println("Added");
	}

	private void display() {
		// TODO Auto-generated method stub
//		for(T i:l) {
//			System.out.println(i);
//		}
		Iterator<T> itr=l.iterator();
		while(itr.hasNext())System.out.println(itr.next());
	}



	public static void main(String[] args) {
		GenericList<String> a=new GenericList<String>();
		a.insert("A");
		a.insert("B");
		a.insert("C");
		a.insert("D");
		a.insert("E");
		a.insert("F");
		a.insert("G");
		a.insert("H");
		a.display();
	}
}

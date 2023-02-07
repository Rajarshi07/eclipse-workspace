package day6_collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionsDemo {

	public CollectionsDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add("Java");
		l.add("python");
		l.add("CPP");
		l.add("Kotlin");
//		for each loop
		for (Object i:l)System.out.print(i+"  ");
		System.out.println();
//		Iterator
		Iterator itr = l.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"  ");
		System.out.println();
//		List Iterator
		ListIterator itrl = l.listIterator();
		while(itrl.hasNext())
			System.out.print(itrl.next()+"  ");
		System.out.println();
		
//		Vector and enumeration
		Vector v = new Vector();
		v.add("java");
		v.add("python");
		v.add("CPP");
		v.add("Kotlin");
		Enumeration enumv = v.elements();
		while(enumv.hasMoreElements())
			System.out.print(enumv.nextElement()+"  ");
		System.out.println();
	}

}

package day6_collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public VectorDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Vector<Employee> v=new Vector<Employee>();
		Employee e1=new Employee(101,"Rajarshi",50000.00);
		Employee e2=new Employee(102,"Swairik",50000.00);
		Employee e3=new Employee(103,"Sagnik",50000.00);
		Employee e4=new Employee(104,"Shubh",50000.00);
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
//		Enumeration enumv=v.elements();
		Enumeration<Employee> enumv=v.elements();
		while(enumv.hasMoreElements()) {
//			Employee e=(Employee) enumv.nextElement();
			Employee e=enumv.nextElement();
			System.out.println(e);
		}
	}
}

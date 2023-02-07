package day6_collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public HashSetDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Set<Employee> hashSet = new HashSet<Employee>();
		Employee e1=new Employee(101,"A",50000.00);
		Employee e2=new Employee(102,"B",50000.00);
		Employee e3=new Employee(103,"C",50000.00);
		Employee e4=new Employee(104,"D",50000.00);
		Employee e5=new Employee(104,"E",50000.00);
//		allows adding objects in new location but not same location in memory.. new keyword creates new element
//		Employee e5=new Employee(104,"D",50000.00);
		hashSet.add(e1);
		hashSet.add(e2);
		hashSet.add(e3);
		hashSet.add(e4);
		hashSet.add(e5);
		for(Employee e:hashSet)System.out.println(e);
	}
}

package day6_collections;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {

	public TreeSetDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Employee> treeSet = new TreeSet<Employee>();
		Employee e1=new Employee(101,"A",50000.00);
		Employee e2=new Employee(102,"B",50000.00);
		Employee e3=new Employee(103,"C",50000.00);
		Employee e4=new Employee(104,"D",50000.00);
		Employee e5=new Employee(105,"E",50000.00);
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		treeSet.add(e5);
		for(Employee e:treeSet)System.out.println(e);
	}

}

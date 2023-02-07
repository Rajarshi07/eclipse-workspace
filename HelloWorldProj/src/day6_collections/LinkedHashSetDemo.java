package day6_collections;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public LinkedHashSetDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Set<Employee> linkedHashSet = new LinkedHashSet<Employee>();
		Employee e1=new Employee(101,"A",50000.00);
		Employee e2=new Employee(102,"B",50000.00);
		Employee e3=new Employee(103,"C",50000.00);
		Employee e4=new Employee(104,"D",50000.00);
		Employee e5=new Employee(105,"E",50000.00);
		linkedHashSet.add(e1);
		linkedHashSet.add(e2);
		linkedHashSet.add(e3);
		linkedHashSet.add(e4);
		linkedHashSet.add(e5);
		for(Employee e:linkedHashSet)System.out.println(e);
	}

}

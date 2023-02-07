package day6_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public HashMapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Employee> hashMap = new HashMap<Integer,Employee>();
		Employee e1=new Employee(101,"A",50000.00);
		Employee e2=new Employee(102,"B",50000.00);
		Employee e3=new Employee(103,"C",50000.00);
		Employee e4=new Employee(104,"D",50000.00);
		Employee e5=new Employee(105,"E",50000.00);
		hashMap.put(e1.getEmpId(), e1);
		hashMap.put(e2.getEmpId(), e2);
		hashMap.put(e3.getEmpId(), e3);
		hashMap.put(e4.getEmpId(), e4);
		hashMap.put(e5.getEmpId(), e5);
		Iterator<Integer> itr=hashMap.keySet().iterator();
		while(itr.hasNext()) {
			int key=itr.next();
			Employee e=hashMap.get(key);
			System.out.println(key+"  "+e);
		}
		
		Set<Map.Entry<Integer,Employee>> entries = hashMap.entrySet();
		for(Map.Entry<Integer,Employee> e:entries) {
			System.out.println(e.getKey()+"  "+e.getValue());
		}
	}
}

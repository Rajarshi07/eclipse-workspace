package day6_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public FilterDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(10,21,32,43,54);
		List<Integer> evenList=new ArrayList<Integer>();
		
//		without streams
		for(int n:l1) {
			if(n%2==0)evenList.add(n);
		}
		System.out.println(evenList);
		
//		with filter stream
		evenList=l1.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(evenList);
		
//		print directly
		l1.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
	}

}

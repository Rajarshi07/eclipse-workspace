package day4;

import java.util.Scanner;

public class TesterOrder {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Order o1 = new Order();
		Order o2 = new Order(101,"Pizza");

		System.out.println("order1: "+o1.getStatus());
		System.out.println("order2: "+o2.getStatus());
		System.out.println("order1: "+o1.getOrderedFoods());
		System.out.println("order2: "+o2.getOrderedFoods());
		
//		o1.setOrderId(101);
//		o1.setOrderedFoods("Pasta");
//		o1.setStatus("Ordered");
//		o1.calculateTotalPrice(10);
//		System.out.println("Order Details");
//		System.out.println("Total Price: "+ o1.getTotalPrice());
		in.close();
	}
}

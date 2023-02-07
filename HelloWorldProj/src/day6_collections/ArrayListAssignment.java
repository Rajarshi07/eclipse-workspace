package day6_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAssignment {
	ArrayList<Employee> l;

	public ArrayListAssignment() {
		// TODO Auto-generated constructor stub
		this.l = new ArrayList<Employee>();
	}

	private void insert(Scanner in) {
		// TODO Auto-generated method stub
		System.out.print("Id:");
		int id=in.nextInt();
		System.out.print("Name:");
		String name=in.next();
		System.out.print("Salary:");
		double salary=in.nextDouble();
		Employee e=new Employee(id,name,salary);
		l.add(e);
		System.out.println("Added");
	}

	private void display(Scanner in) {
		// TODO Auto-generated method stub
		for(Employee i:l) {
			System.out.println(i);
		}
	}

	private void search(Scanner in) {
		// TODO Auto-generated method stub
		System.out.print("Search\nEnter Id:");
		int id=in.nextInt();
		for(Employee i:l) {
			if(i.getEmpId()==id) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("Not Found");
	}

	private void delete(Scanner in) {
		// TODO Auto-generated method stub
		System.out.print("Delete\nEnter Id:");
		int id=in.nextInt();
		for(Employee i:l) {
			if(i.getEmpId()==id) {
				l.remove(i);
				System.out.println("Deleted");
				return;
			}
		}
		System.out.println("Not Found");
	}

	private void update(Scanner in) {
		System.out.print("Update\nEnter Id:");
		// TODO Auto-generated method stub
		int id=in.nextInt();
		for(Employee i:l) {
			if(i.getEmpId()==id) {
				System.out.print("Name:");
				String name=in.next();
				System.out.print("Salary:");
				double salary=in.nextDouble();
				i.setName(name);
				i.setSalary(salary);
				System.out.println("Updated Successfully");
			}
		}
		System.out.println("Not Found");
		

	}

	private void menu() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			int choice = -1;
			System.out.println("1. Insert\n2.Display\n3.Search\n4.Delete\n5.Update\n6.Exit");
			System.out.print("Enter Your Choice: ");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				insert(in);
				break;
			case 2:
				display(in);
				break;
			case 3:
				search(in);
				break;
			case 4:
				delete(in);
				break;
			case 5:
				update(in);
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid Choice!!");
				break;
			}
			if (choice == 6)
				break;
		}
		in.close();
	}

	public static void main(String[] args) {
		ArrayListAssignment a=new ArrayListAssignment();
		a.menu();
	}
}

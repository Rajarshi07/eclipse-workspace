package day4;

public class TesterManager {
	public static void main(String[] args) {
		Manager obj= new Manager(101,"Rajarshi","General Manager");
		obj.display();
		System.out.println("Designation: "+obj.getDesignation());
		
	}
}

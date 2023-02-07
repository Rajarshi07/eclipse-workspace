package day4;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("red","civic","sedan");
		Bus b=new Bus("red","tata",8,36);
		Truck t=new Truck("blue","cybertruck",4,2000);
		b.display();
		c.display();
		t.display();
	}

}

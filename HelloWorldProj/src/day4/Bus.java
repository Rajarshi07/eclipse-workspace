package day4;

public class Bus extends Vehicle {
	int noOfSeats;
	
	public Bus(String colour, String model, int noOfWheels, int noOfSeats) {
		super(colour, model, noOfWheels);
		this.noOfSeats = noOfSeats;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println(noOfSeats+" seater "+ colour+" Bus of Model: "+model+"\n");
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

}

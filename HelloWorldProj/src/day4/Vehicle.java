package day4;

public class Vehicle {
	String colour,model;
	int noOfWheels;
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public Vehicle(String colour, String model, int noOfWheels) {
		super();
		this.colour = colour;
		this.model = model;
		this.noOfWheels = noOfWheels;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

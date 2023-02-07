package day4;

public class Truck extends Vehicle {
	float weight;

	public Truck(String colour, String model, int noOfWheels, float weight) {
		super(colour, model, noOfWheels);
		this.weight = weight;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(noOfWheels+" wheeler "+ colour+" Truck of Model: "+model+" and weight: "+weight+"\n");
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}


}

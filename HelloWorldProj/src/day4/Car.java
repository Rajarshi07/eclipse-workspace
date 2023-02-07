package day4;

public class Car extends Vehicle {
	String subType;
	
	public Car(String colour, String model, String subType) {
		super(colour, model, 4);
		this.subType = subType;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(colour+" "+model+" Car of Subtype:"+subType+"\n");
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

}

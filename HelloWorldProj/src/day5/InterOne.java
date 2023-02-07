package day5;

public interface InterOne {
	public void show();
//	java 8+ default functions can be implemented in interfaces.
//	default function multiple inheritance creates compile time errors but is possible if no ambiguity occurs.
//	we can override the method in the implementing class to solve the error
	default void welcome() {
		System.out.println("welcome to inter1");
	}
	static int add(int a,int b) {
		return a+b;
	}
	static int cube(int a){
		return a*a*a;
	}
}

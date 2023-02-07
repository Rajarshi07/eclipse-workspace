package day5;

public interface InterThree {
	public void print();//	default function multiple inheritance creates compile time errors but is possible if no ambiguity occurs.
	default void welcome() {
		System.out.println("welcome to inte3");
	}
}

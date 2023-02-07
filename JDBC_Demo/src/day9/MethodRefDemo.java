package day9;

import java.util.UUID;
import java.util.function.Function;

//  just read this up
//  https://www.geeksforgeeks.org/method-references-in-java-with-examples/

class Student{
	String name;

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
		this.name = "Student-"+UUID.randomUUID();
		// TODO Auto-generated constructor stub
	}
	
}


@FunctionalInterface
interface StudentInterface1{
	Student Student(String s);
}

@FunctionalInterface
interface StudentInterface2{
	Student randomFunctionThatRefersToConstructor();
}

@FunctionalInterface
interface print{
	<T> void p(T args);
}


public class MethodRefDemo {
	public static void main(String[] args) {
		StudentInterface1 si1 = Student::new;
		StudentInterface2 si2 = Student::new;  //new refers to constructor of class.
		System.out.println(si1.Student("RGD").getName());
		System.out.println(si2.randomFunctionThatRefersToConstructor().getName());
		print p = System.out::println;
		p.p("Hello");
		p.p("Hi");
	}

}

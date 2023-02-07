package day4;

public class TesterCalulator {
public static void main(String[] args) {
	Calculator c1=new Calculator();
	System.out.println(c1.findAverage(1.232,25.5,7.9));
	System.out.println(c1.findAverage(1.232,25.5,7.9,4.5));
	System.out.println(c1.findAverage(1.232,25.5,7.9,4.5,7.9));
	
}
}

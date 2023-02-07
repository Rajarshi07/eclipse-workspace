package day5;

public class ExceptionHandling {

	public ExceptionHandling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0, b = 10;
		int c[] = { 0 };
		try {
			System.out.println(s / b);
			c[5] = 10;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Exception " + e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

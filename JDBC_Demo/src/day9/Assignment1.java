package day9;


@FunctionalInterface //only 1 abstract method supported
interface fi{
	int cube(int n);
	default int square(int n) {return n*n;};
	default int add(int a,int b) {return a+b;};
	static int sub(int a,int b) {return a-b;};
	static int mul(int a,int b) {return a*b;};
	static int div(int a,int b) {return a/b;};
}
public class Assignment1 implements fi{

	public Assignment1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Assignment1 a=new Assignment1();
		System.out.println(a.cube(5));
		System.out.println(a.square(5));
		System.out.println(a.add(4,2));
		System.out.println(fi.sub(4,2));
		System.out.println(fi.mul(4,2));
		System.out.println(fi.div(4,2));
	}
	@Override
	public int cube(int n) {
		// TODO Auto-generated method stub
		return n*n*n;
	}

}

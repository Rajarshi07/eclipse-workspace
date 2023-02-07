package day5;

public class MyCalculator implements AdvancedArithmetic {

	public MyCalculator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int divisor_sum(int n) {
		// TODO Auto-generated method stub
		if(n>1000)return -1;
		int s=0;
		for(int i=1;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				s+=i;
				System.out.println("    " +i);
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		MyCalculator a=new MyCalculator();
		System.out.println(a.divisor_sum(50));
		System.out.println(a.divisor_sum(1250));
		System.out.println(a.divisor_sum(500));
	}

}

package day10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamDemo {

	public StreamDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Integer [] a= {1,3,5,4,7,6,9};
		int ans = Arrays.stream(a).mapToInt(k->k).filter(n->n%2==0).map(n->n*n).sum();//.reduce(0,(x,y)->x+y);
		int[] b= {1,3,5,4,7,6,9};
		int ans2 = IntStream.of(b).filter(n->n%2==0).map(n->n*n).sum();
		int ans3 = Arrays.stream(b).filter(n -> n % 2 == 0).map(n -> n * n).sum();
		System.out.println(ans);
		System.out.println(ans2);
		System.out.println(ans3);
	}
}

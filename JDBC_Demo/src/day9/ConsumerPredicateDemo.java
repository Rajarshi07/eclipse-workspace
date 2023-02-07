package day9;

import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.Function;


public class ConsumerPredicateDemo {

	public ConsumerPredicateDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> cons = (s)->System.out.println(s.toUpperCase());
		cons.accept("hello");
		BiConsumer<Integer,String> bicon = (a,b)->System.out.println(a+b.toUpperCase());
		bicon.accept(1, "Hello");
		Predicate<Integer> isEven=(i)->i%2==0;
		System.out.println(isEven.test(13)?"even":"odd");
		System.out.println(isEven.test(24)?"even":"odd");
		BiPredicate<String,String> startTest = (st1,st2)->st1.startsWith(st2);
		BiPredicate<String,String> endTest = (st1,st2)->st1.endsWith(st2);
		System.out.println(startTest.and(endTest).test("starts", "s"));
		System.out.println(startTest.and(endTest).test("start", "s"));
		System.out.println(startTest.negate().test("start", "s"));
		Consumer<Object> p = (o)->System.out.println(o);
		p.accept("hello"+123);
		Function<String,Integer> aaa = (a)-> a.length();
		p.accept(aaa.apply("ABCD"));
		
	}

}

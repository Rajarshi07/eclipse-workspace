package day9;

import java.util.Optional;

public class OptionalDemo {

	public OptionalDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st=new String[20];
//		st[0]="abc";
		Optional<String> checkStr = Optional.ofNullable(st[0]);
//		checkStr.ifPresent(n->System.out.println(n));
		checkStr.ifPresentOrElse((n)->System.out.println(n), ()->System.out.println("EMPTY"));
//		Optional<String> op2 =Optional.of(st[0]); // throws null pointer if not present else gives value.. not used muhc
//		if(checkStr.isPresent()) {
//		String st2 = st[0].toUpperCase();
//		System.out.println(st2);
//		}else {
//			System.out.println("Value not present");
//		}
	}

}

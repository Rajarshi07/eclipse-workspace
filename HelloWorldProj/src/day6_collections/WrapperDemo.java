package day6_collections;

public class WrapperDemo {

	public WrapperDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int i=1;// primitive types
		Integer i1=new Integer(2); 
		//wrapper class from java.lang package imported by default
//		creates object
//		hibernate,collection,multithreading ->synchronize
//		Integer,Boolean,Character,Float,Double,Long,Byte,Short
//		boxing,unboxing concept
		Integer i2=new Integer(3);
		Integer i3=i;//		Auto-boxing
//		create primitive value inside an object. -> boxing/wrapping
		int j=i3.intValue(); // unboxing/unwrapping
		int k=i2;  // Auto-unboxing
//		primitives work faster 
//		but frameworks use wrappers because its purely object oriented lang
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
	}

}

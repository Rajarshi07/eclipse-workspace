package day5;

public class College {

	public College() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {100,30,70,90};
		Student a=new UG("Rajarshi",new int[]{100,30,70,90});
		Student b=new PG("Swairik",new int[]{100,30,40,70});
		System.out.println(a.generateResult());
		System.out.println(b.generateResult());
	}


}
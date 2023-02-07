package day9;

//@FunctionalInterface
interface demo{
	void print(String msg);
//	void print1(String msg);
}


interface demoInter{
	static void demo() {System.out.println("Demo");};
	default int sqr(int n) {return n*n;};
}

@FunctionalInterface
interface addInter extends demoInter{
	int add(int v1,int v2);
}
public class FunctionalInDemo implements demo{

	public FunctionalInDemo() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInDemo d=new FunctionalInDemo();
		d.print("Functional interface demo");
		
		addInter a = (int v1,int v2)->v1+v2;
		System.out.println("Res: "+a.add(7,12));
	}

	@Override
	public void print(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

}

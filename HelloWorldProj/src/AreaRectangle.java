import java.util.Scanner;
public class AreaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Length: ");
		float l=sc.nextFloat();
		System.out.print("Breadth: ");
		float b=sc.nextFloat();
		sc.close();
		System.out.println("Length: "+l+"\nBreadth: "+b+"\nArea: "+l*b);
	}

}

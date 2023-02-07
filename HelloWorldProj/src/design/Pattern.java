package design;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** 
		 * this is a documentation comment 
		 * @author rajarshid
		 * */
		int n=10;
		for(int i=n;i>0;i--) {
			for(int k=0;k<n-i;k++) {
				System.out.print(' ');
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

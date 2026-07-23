package Patterns;

public class kFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		upper
		int n=4;
		for(int i=n;i>=1;i--) {
			
			//stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower
		for(int i=2;i<=n;i++) {
			
			//stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

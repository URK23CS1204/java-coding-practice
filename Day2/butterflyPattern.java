package Patterns;

public class butterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		
		//Upper
		for(int i=1;i<=n;i++) {
			//left part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//spaces
			int spaces = 2 * (n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			//right part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower
		for(int i=n;i>=1;i--) {
			//left part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//spaces
			int spaces = 2 * (n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			//right part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

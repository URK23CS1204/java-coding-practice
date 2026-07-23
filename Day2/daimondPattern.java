package Patterns;

public class daimondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		//upper
		for(int i =1;i<=n;i++) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//stars
			//odd stars
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
			//even stars
			for(int j=1;j<=2*i;j++) {
				System.out.print("*");
			}
			System.out.println();
	}
		//lower
		for(int i =n;i>=1;i--) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//stars
			//odd stars
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
			
			//even stars
			for(int j=1;j<=2*i;j++) {
				System.out.print("*");
			}
			System.out.println();
	}
	}

}

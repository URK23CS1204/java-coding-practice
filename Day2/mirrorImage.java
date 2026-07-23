package Patterns;

public class mirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		//upper
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			//number
			for(int j=i;j<=n;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			//spaces
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			//number
			for(int j=i;j<=n;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}

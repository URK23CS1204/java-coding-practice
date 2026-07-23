package Functions;
import java.util.Scanner;
public class programSix {
	public static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			int product = i*n;
			System.out.println(product);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printTable(n);

	}

}

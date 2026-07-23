package Functions;
import java.util.Scanner;
public class programFive {
	public static void printEven(int a) {
		if(a%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		printEven(a);

	}

}

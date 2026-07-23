
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = sc.nextInt();
		System.out.println("Enter number b:");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println(sum);
		int diff = a-b;
		System.out.println(diff);
		float mul = a*b;
		System.out.println(mul);
		float div = a/b;
		System.out.println(div);
		float rem = a%b;
		System.out.println(rem);

	}

}




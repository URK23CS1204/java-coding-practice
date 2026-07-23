package Functions;
import java.util.Scanner;
public class programTwo {
	//declaring the function
	
	public static int calculateSum(int a,int b) {
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The number 1: ");
		int a = sc.nextInt();
		System.out.println("The number 2: ");
		int b = sc.nextInt();
		//Calling the function
		int sum = calculateSum(a,b);
		System.out.println("the Total sum: " + sum);

	}

}

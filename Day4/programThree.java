package Functions;
import java.util.Scanner;
public class programThree {

	//Declaring the function
	
	public static int calculateMul(int a,int b) {
		int mul = a*b;
		return mul;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a: ");
		int a  = sc.nextInt();
		System.out.println("Enter number b: ");
		int b  = sc.nextInt();
		
		//Calling the function
		int mul = calculateMul(a,b);
		System.out.println("The Product of 2 numbers: " + mul);

	}

}

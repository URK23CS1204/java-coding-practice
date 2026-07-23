
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking Input from User");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter number2 :");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum of the two muns is " + ":" + sum);
//		
		
		//boolean
//		boolean b1 = sc.hasNextInt();
//		System.out.println(b1);
		
		//String for a word
//		String str = sc.next();
//		System.out.println(str);
		
		//String for full sentence
		String str = sc.nextLine();
		System.out.println(str);
	}
	

}

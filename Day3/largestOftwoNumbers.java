package day1Functions;
import java.util.Scanner;
public class largestOftwoNumbers {

	public static void largestOftwonumbers(int a,int b) {
		if(a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		largestOftwonumbers(a,b);
	}

}

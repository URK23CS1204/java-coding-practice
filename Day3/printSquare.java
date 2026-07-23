package day1Functions;
import java.util.Scanner;
public class printSquare {
	
	public static void printSquare(int n) {
		int square = n * n;
		System.out.println(square);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printSquare(n);
		
	}

}

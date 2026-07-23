package Functions;
import java.util.Scanner;


public class programSeven {
	public static int calculateAverage(int a,int b,int c) {
		return (a+b+c)/3;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("the average:" + calculateAverage(a,b,c));

	}

}

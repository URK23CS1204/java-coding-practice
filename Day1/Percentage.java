
import java.util.Scanner;
public class PercentageProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Marks out of 100");
		System.out.println("Enter Subject1 Marks :");
		int subject1 = sc.nextInt();
		System.out.println("Enter Subject2 Marks :");
		int subject2 = sc.nextInt();
		System.out.println("Enter Subject3 Marks :");
		int subject3 = sc.nextInt();
		System.out.println("Enter Subject4 Marks :");
		int subject4 = sc.nextInt();
		System.out.println("Enter Subject5 Marks :");
		int subject5 = sc.nextInt();
		
		int TotalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
		int percentage = TotalMarks/5;
		System.out.println("TotalMarks :" + TotalMarks);
		System.out.println("Percentage out of 100 :" + percentage);
	}
}

package Functions;
import java.util.*;
public class programOne {
	
	//Declaring the function
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		//calling the function
		printMyName(name);

	}

}

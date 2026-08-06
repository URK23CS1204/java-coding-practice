package Day9;
import java.util.Scanner;
public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		long sum =0;
		long min = arr[0];
		long max = arr[0];
		
		for(int num : arr) {
			sum = sum +num;
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
		}
		long minSum = sum - max;
		long maxSum = sum - min;
		System.out.println(minSum + " " + maxSum);
		
	}

}

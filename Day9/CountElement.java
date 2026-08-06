package Day9;
import java.util.Scanner;
public class countElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int left = 0;
		int right = arr.length-1;
		int count =0;
		while(left <= right) {
			count++;
			int mid = left + (right - left)/2;
			
			if(arr[mid] == target) {
				
				System.out.print(count); 
				break;
			}
			else if(arr[mid] < target) {
				left = mid +1;
			}
			else {
				right = mid - 1;
			}
		}

	}

}

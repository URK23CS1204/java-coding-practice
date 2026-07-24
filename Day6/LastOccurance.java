package Day6;
import java.util.Scanner;
public class LastOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		for(int i=arr.length-1;i<arr.length;i--) {
			if(arr[i] == tar) {
				System.out.print(i);
				break;
			}
		}
	}

}

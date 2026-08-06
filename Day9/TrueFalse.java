package Day9;

import java.util.Scanner;

public class TrueFalse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int leftIndex=0;
		int rightIndex=arr.length-1;
		while(leftIndex <= rightIndex) {
		int middleIndex = (leftIndex + rightIndex)/2;
		if(arr[middleIndex] == target) {
			System.out.print("true");
			return;
		}
		else if(arr[middleIndex] < target) {
			leftIndex = middleIndex+1;
		}
		else {
			rightIndex = middleIndex-1;
		}
		
		}
		System.out.print("false");
		
	}

}

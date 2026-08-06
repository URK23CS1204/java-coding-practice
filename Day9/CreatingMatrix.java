package Day9;
import java.util.ArrayList;
import java.util.Scanner;
public class CreatingMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				list.get(i).add(sc.nextInt());
			}
		}
		System.out.println(list);
	}

}

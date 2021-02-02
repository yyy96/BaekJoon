package step_05;
import java.util.*;
public class baekjoon_10818 {

	public static void main(String[] args) {
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		int arr[] = new int[N];
		int Big, Small;
		
		for(int i=0; i<N; i++) {
			arr[i] = s.nextInt();
		}
		
		Big = arr[0];
		Small = arr[0];
		for(int i=0; i<N; i++) {
			if(Big<=arr[i]) {
				Big = arr[i];
			}
			if(Small>=arr[i]) {
				Small = arr[i];
			}
		}
		System.out.print(Small+ " ");
		System.out.print(Big);

	}

}

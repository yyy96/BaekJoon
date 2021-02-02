package step_05;
import java.util.*;
public class baekjoon_2562 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = s.nextInt();
		}
		
		int Big = arr[0];
		int Big_index = 0;
		for(int i=0; i<9; i++) {
			if(Big<=arr[i]) {
				Big = arr[i];
				Big_index = i;
			}
		}
		System.out.println(Big);
		System.out.println(Big_index+1);

	}

}

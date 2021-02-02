package step_01;
import java.util.Scanner;
public class baekjoon_1000 {

	public static void main(String[] args) {
		
		int A = 0;
        int B = 0;
        int C = 0;
        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();
        if(A>0&&B<10){
            C = A+B;
            System.out.println(C);
        }
        
        
	}

}
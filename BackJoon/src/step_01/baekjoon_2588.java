package step_01;
import java.util.*;
public class baekjoon_2588 {

	public static void main(String[] args) {
		int A,B;
		int []b = new int[3];
		int []result = new int[4];
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
	    B = s.nextInt();
	    b[0] = B/100;
	    b[1] = (B-(100*b[0]))/10;
	    b[2] = B-(100*b[0])-(10*b[1]);
	    
	    result[0] = A*b[2];
	    result[1] = A*b[1];
	    result[2] = A*b[0];
	    result[3] = result[0]+result[1]*10+result[2]*100;
	    
	    System.out.println(result[0]);
	    System.out.println(result[1]);
	    System.out.println(result[2]);
	    System.out.println(result[3]);
	        
	}

}

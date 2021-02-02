package step_05;
import java.util.*;

public class baekjoon_1546 {
	public static void main(String[] args) {
	int N; //시험 본 과목의 개수
	Scanner s = new Scanner(System.in);
	N = s.nextInt();
	double score[] = new double[N];
	
	if(N<=1000) {
		for(int i=0; i<N; i++) {
			score[i] = s.nextDouble();
		}
	}
	
	//최대값 구하기
	double M = 0;
	for(int i=0; i<N; i++) {
		if(score[i]<=100&&score[i]>=0) {
			if(M<=score[i])
				M = score[i];
		}
	}
	
	//평균 구하기
	for(int i=0; i<N; i++) {
		score[i] = (score[i]/M)*100;
	}
	double sum = 0;
	for(int i=0; i<N; i++) {
		sum += score[i];
	}
	double avg = sum/N;
	System.out.println(avg);
	
	
	}
}

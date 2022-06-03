package 커뮤러닝.week1;

import java.util.Arrays;
import java.util.Comparator;

public class Simulation1 {
	
	public static int solution(int[] A, int[] B) {
		int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int pointerA = 0;
        int pointerB = 0;
        for(int i=0; i<A.length; i++) {
            if(A[pointerA] < B[pointerB]) {
                answer++;
                pointerA++;
            }
            pointerB++;
        }

        return answer;
    }
	
	public static void main(String[] args) {
		int[] A = {5, 1, 3, 7};
		int[] B = {2, 2, 6, 8};
		
		System.out.println(solution(A, B));
	}

}

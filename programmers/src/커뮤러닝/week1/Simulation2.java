package 커뮤러닝.week1;

import java.util.Arrays;
import java.util.Comparator;

// 숫자게임
public class Simulation2 {
	
	public static int solution(int[] A, int[] B) {
		int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int index = B.length-1;
        for(int i=B.length-1; i>=0; i--) {
            if(A[i] < B[index]) {
            	index--;
                answer++;
            }
        }

        return answer;
    }
	
	public static void main(String[] args) {
		int[] A = {5, 1, 3, 7};
		int[] B = {2, 2, 6, 8};
		
		System.out.println(solution(A, B));
	}

}

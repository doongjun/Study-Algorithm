package 커뮤러닝.week1;

import java.util.stream.IntStream;

//예산
public class BinarySearch2 {
	public static int solution(int[] budgets, int M) {
        int answer = 0;

        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0);
        while(min <= max) {
            final int mid = (min+max)/2;
            int sum = IntStream.of(budgets).map(budget -> Math.min(budget, mid)).sum();
            
            if(sum <= M) {
            	answer = mid;
            	min = mid+1;
            } else {
            	max = mid-1;
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] budgets = {120, 110, 140, 150};
		int M = 485;
		
		System.out.println(solution(budgets, M));
	}

}

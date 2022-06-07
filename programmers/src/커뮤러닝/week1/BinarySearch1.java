package 커뮤러닝.week1;

import java.util.Arrays;

// 예산
public class BinarySearch1 {
	
	public static long sumBudgets(int[] budgets, int upperLimit) {
        long sum = 0;
        for(int budget : budgets) {
            if(budget > upperLimit) {
                sum += upperLimit;
            } else {
                sum += budget;
            }
        }
        return sum;
    }
	
	public static int solution(int[] budgets, int M) {
        int answer = 0;

        Arrays.sort(budgets);
        int min = 0;
        int max = budgets[budgets.length-1];
        while(min <= max) {
            int mid = (min+max)/2;
            if(sumBudgets(budgets, mid) <= M) {
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

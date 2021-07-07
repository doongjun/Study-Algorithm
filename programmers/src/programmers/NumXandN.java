package programmers;

import java.util.Arrays;

//x만큼 간격이 있는 n개의 숫자
public class NumXandN {
	
	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        
	        int k=x;
	        for(int i=0; i<answer.length; i++) {
	        	answer[i] = k;
	        	k = k + x;
	        }
	        System.out.println(Arrays.toString(answer));
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		NumXandN numxn = new NumXandN();
		NumXandN.Solution s = numxn.new Solution();
		
		int x = 0;
		int n = 2;
		s.solution(x, n);

	}

}

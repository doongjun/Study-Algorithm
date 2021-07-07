package programmers;

import java.util.Arrays;

public class CommonMultiple {
	class Solution {
	    public int[] solution(int n, int m) {
	        
	        int x = n, y = m, k=0;
	        while(y!=0) {
	        	k = x%y;
	        	x = y;
	        	y = k;
	        }
	        
	        int a = n*m/x;
	        
	        int[] answer = {x, a};
	        System.out.println(Arrays.toString(answer));
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		CommonMultiple commonmultiple = new CommonMultiple();
		CommonMultiple.Solution s = commonmultiple.new Solution();
		
		s.solution(3, 12);
	}

}

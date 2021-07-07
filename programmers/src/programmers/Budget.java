package programmers;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int[] d, int budget) {
		        int answer = 0;
		        
		        Arrays.sort(d);
		        
		        for(int i=0; i<d.length; i++) {
		        	budget -= d[i];
		        	if(budget<0) break;
		        	answer ++;
		        }
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		int[] d = {2,2,3,3};
		int budget = 1;
		Solution s = new Solution();
		
		s.solution(d, budget);
	}
	}

package programmers;

import java.util.ArrayList;

//큰 수 만들기
public class Greedy1 {

	public static void main(String[] args) {
		class Solution {
		    public String solution(String number, int k) {
		    	StringBuilder sb = new StringBuilder();
		    	
		    	int cnt = number.length() - k;
		    	int left = 0;
		    	int right = number.length() - cnt;
		    	int max = -1;
		    	int idx = 0;
		    	
		    	while(cnt > 0) {
		    		max = -1;
		    		for(int i=left; i<=right; i++) {
		    			int num = number.charAt(i)-'0';
		    			if(num > max) {
		    				idx = i;
		    				max = num;
		    			}
		    		}
		    		sb.append(number.charAt(idx));
		    		left = idx+1;
		    		right = number.length() - --cnt;
		    	}
		    	String answer = sb.toString();
		    	System.out.println(answer);
		    	return answer;
		    }
		}
		
		Solution s = new Solution();
		String number = "4177252841";
		int k = 4;
		s.solution(number, k);
	}

}

package programmers;

import java.util.Arrays;

//소수 찾기
public class FindDecimal {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        int[] temp = new int[n+1];
	        
	        for(int i=2; i<=n; i++) {
	        	temp[i] = i;
	        }
	        
	        for(int i=2; i<=n; i++) {
	        	if(temp[i] == 0) continue;
	        	for(int j=i+i; j<=n; j += i) {
	        		temp[j]=0;
	        	}
	        }
	       
	        for(int i=2; i<=n; i++) {
	        	if(temp[i] != 0) answer++;
	        }
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		FindDecimal decimal = new FindDecimal();
		FindDecimal.Solution s = decimal.new Solution();
		
		s.solution(20);
	}

}

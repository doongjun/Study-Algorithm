package programmers;

public class Country124 {

	public static void main(String[] args) {
		class Solution {
		    public String solution(int n) {
		      
		        int[] num = {4,1,2};
		        
		        StringBuilder sb = new StringBuilder();
		        while(n>0) {
		        	sb.append(num[n%3]);
		        	n=(n-1)/3;
		        }
		        String answer = sb.reverse().toString();
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		s.solution(13);
	}

}

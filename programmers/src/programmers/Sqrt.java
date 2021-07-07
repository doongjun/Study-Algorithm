package programmers;

//정수 제곱근 판별
public class Sqrt {
	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        
	        long a = (long)Math.sqrt(n);
	        double b = Math.sqrt(n);
	        
	        if(a == b) {
	        	answer = (a+1)*(a+1);
	        }
	        else {
	        	answer = -1;
	        }
	        System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		Sqrt sqrt = new Sqrt();
		Sqrt.Solution s = sqrt.new Solution();
		
		s.solution(3);
	}

}

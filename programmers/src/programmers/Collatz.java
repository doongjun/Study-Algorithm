package programmers;

//콜라츠 추측
public class Collatz {
	class Solution {
	    public int solution(long num) {
	        int answer = 0;
	        
	        while(num != 1) {
	        	if(num%2 == 0) {
	        		num = num/2;
	        	}
	        	else {
	        		num = num*3+1;
	        	}
	        	answer++;
	        }
	        if(answer>=500) {
	        	answer=-1;
	        }
	        System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		Collatz collatz = new Collatz();
		Collatz.Solution s = collatz.new Solution();
		
		s.solution(626331);
	}

}

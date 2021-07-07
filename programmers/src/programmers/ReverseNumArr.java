package programmers;

import java.util.Arrays;

//자연수 뒤집어 배열로 만들기
public class ReverseNumArr {
	class Solution {
	    public int[] solution(long n) {
	        
	        StringBuilder sb = new StringBuilder(Long.toString(n));
	        String reversenum = sb.reverse().toString();
	        
	        int[] answer = new int[reversenum.length()];
	        
	        for(int i=0; i<answer.length; i++) {
	        	answer[i] = reversenum.charAt(i)-'0';
	        }
	        
	        System.out.println(Arrays.toString(answer));
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		ReverseNumArr numarr = new ReverseNumArr();
		ReverseNumArr.Solution s = numarr.new Solution();
		
		s.solution(12345);
	}

}

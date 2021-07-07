package programmers;

import java.util.Arrays;

//정수 내림차순
public class DescendingNum {
	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        String x = Long.toString(n);
	        String tmp = "";
	        int[] a = new int[x.length()];
	        
	        for(int i=0; i<x.length(); i++) {
	        	a[i] = x.charAt(i)-'0';
	        }
	        Arrays.sort(a);
	        
	        for(int i=a.length-1; i>=0; i--) {
	        	tmp += Integer.toString(a[i]);
	        }
	        answer = Long.parseLong(tmp);
	        
	        System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		DescendingNum desnum = new DescendingNum();
		DescendingNum.Solution s = desnum.new Solution();
		
		s.solution(118372);
	}

}

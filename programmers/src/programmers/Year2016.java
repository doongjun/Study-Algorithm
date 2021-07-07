package programmers;

//2016년
public class Year2016 {
	class Solution {
	    public String solution(int a, int b) {
	        String answer = "";
	        
	        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        
	        int total = 5;
	        
	        for(int i=0; i<a-1; i++) {
	        	total += day[i];
	        }
	        total += b-1;
	        
	        answer = week[total%7];
	        System.out.println(answer);
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		Year2016 year = new Year2016();
		Year2016.Solution s = year.new Solution();
		
		int a = 1;
		int b = 2;
		
		s.solution(a, b);

	}

}

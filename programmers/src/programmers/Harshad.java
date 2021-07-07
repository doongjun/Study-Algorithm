package programmers;

//하샤드 수
public class Harshad {
	class Solution {
	    public boolean solution(int x) {
	        boolean answer = true;
	        String s = Integer.toString(x);
	        int sum = 0;
	        for(int i=0; i<s.length(); i++) {
	        	sum = sum + Character.getNumericValue(s.charAt(i));
	        }
	      //sum = sum + s.charAt(i)-'0';
        	if(x%sum != 0) answer=false;
	        System.out.println(answer);
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Harshad harshad = new Harshad();
		Harshad.Solution s = harshad.new Solution();
		
		int x = 11;
		s.solution(x);

	}

}

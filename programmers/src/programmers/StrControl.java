package programmers;

//문자열 다루기 기본
public class StrControl {
	class Solution {
	    public boolean solution(String s) {
	        boolean answer = true;
	        if(s.length() != 4 && s.length() != 6) {
	        	return false;
	        }
	        try {
	        	int a = Integer.parseInt(s);
	        }
	        catch(Exception e){
	        	answer = false;
	        }
	        
	        System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		StrControl strctrl = new StrControl();
		StrControl.Solution s = strctrl.new Solution();
		String str = "1234";
		s.solution(str);
	}

}

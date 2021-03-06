package programmers;

import java.util.Stack;

//올바른 괄호
public class TrueBracket {

	public static void main(String[] args) {
		class Solution {
		    boolean solution(String s) {
		        boolean answer = true;
		        Stack<Character> stack = new Stack<>();
		        
		        for(int i=0; i<s.length(); i++) {
		        	char b = s.charAt(i);
		        	if(b == '(') {
		        		stack.push(b);
		        	}
		        	else {
		        		if(stack.isEmpty()) {
		        			return false;
		        		}
		        		else
		        			stack.pop();
		        	}
		        }
		        if(!stack.isEmpty())
		        	return false;
		        
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		String bracket = "()()";
		s.solution(bracket);
	}
}

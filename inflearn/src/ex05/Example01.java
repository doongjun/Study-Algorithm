package ex05;

import java.util.Scanner;
import java.util.Stack;

// stack
// 1.올바른 괄호
public class Example01 {
	static String solution(String s) {
		String answer = "YES";
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(') {
				stack.add(c);
				continue;
			} 
			
			if(stack.isEmpty()) return "NO";
			
			stack.pop();
		}
		
		if(!stack.isEmpty()) return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		System.out.println(solution(s));
	}
}

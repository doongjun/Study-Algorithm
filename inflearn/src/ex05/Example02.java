package ex05;

import java.util.Scanner;
import java.util.Stack;

// stack
// 2.괄호문자제거
public class Example02 {
	static String solution(String s) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(') {
				stack.add(c);
				continue;
			}
			
			if(c == ')') {
				stack.pop();
				continue;
			}
			
			if(stack.isEmpty()) {
				sb.append(c);
			}
		}
		
		answer = sb.toString();
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		System.out.println(solution(s));
	}
}

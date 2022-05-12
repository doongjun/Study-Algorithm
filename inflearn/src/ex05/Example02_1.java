package ex05;

import java.util.Scanner;
import java.util.Stack;

// stack
// 2.괄호문자제거
public class Example02_1 {
	static String solution(String s) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == ')') {
				while(stack.pop() != '(');
			} else {
				stack.push(c);
			}
		}
		for(int i=0; i<stack.size(); i++) {
			sb.append(stack.get(i));
		}
		answer= sb.toString();
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		System.out.println(solution(s));
	}
}

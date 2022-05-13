package ex05;

import java.util.Scanner;
import java.util.Stack;

// stack
// 4.후위식 연산
public class Example04 {
	static int solution(String s) {
		int answer =0;
		Stack<Integer> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '+') {
				stack.push(stack.pop() + stack.pop());
			} else if (c == '-') {
				stack.push((stack.pop() - stack.pop())*-1);
			} else if (c == '*') {
				stack.push(stack.pop() * stack.pop());
			} else if (c == '/') {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b/a);
			} else {
				stack.push(c-'0');
			}
		}
		
		answer = stack.pop();
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		System.out.println(solution(s));
	}
}

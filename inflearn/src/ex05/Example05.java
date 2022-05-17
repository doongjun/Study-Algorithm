package ex05;

import java.util.Scanner;
import java.util.Stack;

// stack
// 5.쇠막대기
public class Example05 {
	static int solution(String s) {
		int answer =0;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				stack.push('(');
				continue;
			}
			
			stack.pop();
			if(s.charAt(i-1) == '(') {
				answer += stack.size();
			} else {
				answer ++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		System.out.println(solution(s));
	}
}

package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// 10773 제로
public class Stack6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			int k = scan.nextInt();
			
			if(k == 0) {
				if(stack.isEmpty()) continue;
				stack.pop();
			} else {
				stack.push(k);
			}	
		}
		
		int answer = 0;
		while(!stack.isEmpty()) {
			answer += stack.pop();
		}
		
		System.out.println(answer);
	}

}

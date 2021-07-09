package baekjoon;

import java.util.Scanner;
import java.util.Stack;

//1874
//스택 수열
public class Stack2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] cal = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			cal[i] = scan.nextInt();
		}
		
		StringBuffer sb = new StringBuffer();
		Stack<Integer> stack = new Stack<>();
		int i = 1;
		int j = 1;
		stack.push(i);
		sb.append("+");
		
		while(true) {
				if(i==n && stack.isEmpty()) break;
				if(i>n) break;
				if(!stack.isEmpty()) {
					if(cal[j]==stack.peek()) {
						stack.pop();
						sb.append("-");
						j++;
						continue;
					}
				}
				
				i++;
				sb.append("+");
				stack.push(i);
			
		}
		if(i>n) {
			System.out.println("NO");
		}
		else {
			String str = sb.toString();
			for(int k=0; k<str.length(); k++) {
				System.out.println(str.charAt(k));
		}
			

	}

}}

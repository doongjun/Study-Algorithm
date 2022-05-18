package ex05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// queue
// 7.교육과정 설계
public class Example07 {
	static String solution(String a, String b) {
		String answer = "NO";
		
		Queue<Character> q = new LinkedList<>();
		for(char c : a.toCharArray()) {
			q.offer(c);
		}
		
		for(char c : b.toCharArray()) {
			if(q.peek() == c) {
				q.poll();
			}
			if(q.isEmpty()) return "YES";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		System.out.println(solution(a, b));
	}
}

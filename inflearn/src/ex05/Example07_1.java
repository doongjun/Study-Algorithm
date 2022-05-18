package ex05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// queue
// 7.교육과정 설계
public class Example07_1 {
	static String solution(String a, String b) {
		String answer = "YES";
		
		Queue<Character> q = new LinkedList<>();
		for(char c : a.toCharArray()) {
			q.offer(c);
		}
		
		for(char c : b.toCharArray()) {
			if(q.contains(c)) {
				if(c != q.poll()) return "NO";
			}
		}
		
		if(!q.isEmpty()) return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		System.out.println(solution(a, b));
	}
}

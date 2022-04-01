package ex01;

import java.util.Scanner;

// 1.문자찾기
public class Example01 {
	
	static int solution(String line, char target) {
		int answer = 0;
		line = line.toUpperCase();
		target = Character.toUpperCase(target);
		
		for(char c : line.toCharArray()) {
			if(c == target) answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.next();
		char target = scan.next().charAt(0);
		
		System.out.println(solution(line, target));
	}
}

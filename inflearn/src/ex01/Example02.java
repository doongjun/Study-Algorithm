package ex01;

import java.util.Scanner;

// 2.대소문자 변환
public class Example02 {
	
	static String solution(String line) {
		String answer = "";
		StringBuffer sb = new StringBuffer();
		
		for(char c : line.toCharArray()) {
			if(Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		
		answer = sb.toString();
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.next();
		
		System.out.println(solution(line));
	}
}

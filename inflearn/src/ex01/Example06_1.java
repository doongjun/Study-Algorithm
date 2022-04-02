package ex01;

import java.util.Scanner;

// 6.중복문자제거
public class Example06_1 {
	
	static String solution(String word) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<word.length(); i++) {
			if(word.indexOf(word.charAt(i)) == i) sb.append(word.charAt(i));
		}
		
		answer = sb.toString();
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		System.out.println(solution(word));
	}
}

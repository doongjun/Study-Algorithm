package ex01;

import java.util.Scanner;

// 6.회문문자열
public class Example07_1 {
	
	static String solution(String word) {
		String answer = "YES";
		
		word = word.toUpperCase();
		int len = word.length();
		for(int i=0; i<len/2; i++) {
			if(word.charAt(i) != word.charAt(len-1-i)) return "NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		System.out.println(solution(word));
	}
}

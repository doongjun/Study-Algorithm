package ex01;

import java.util.Scanner;

// 6.회문문자열
public class Example07_2 {
	
	static String solution(String word) {
		String answer = "NO";
		
		String rWord = new StringBuilder(word).reverse().toString();
		
		if(word.equalsIgnoreCase(rWord)) return "YES";
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		System.out.println(solution(word));
	}
}

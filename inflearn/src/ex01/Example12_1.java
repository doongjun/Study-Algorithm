package ex01;

import java.util.Scanner;

// 12.암호
public class Example12_1 {
	
	static String solution(int n, String word) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		
		word = word.replace("#", "1").replace("*", "0");
		
		for(int i=0; i<n; i++) {
			int ascii = Integer.parseInt(word.substring(0, 7), 2);
			sb.append((char) ascii);
			word = word.substring(7);
		}
		answer = sb.toString();
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String word = scan.next();
		System.out.println(solution(n, word));
	}
}

package ex01;

import java.util.Scanner;

// 12.암호
public class Example12 {
	
	static String solution(int n, String word) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		
		word = word.replaceAll("#", "1").replaceAll("\\*", "0");
		
		for(int i=0; i<n; i++) {
			int tmp = i*7;
			int ascii = Integer.valueOf(word.substring(tmp, tmp+7), 2);
			sb.append((char) ascii);
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

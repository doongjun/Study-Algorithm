package ex01;

import java.util.Scanner;

// 11.문자열 압축
public class Example11 {
	
	static String solution(String word) {
		String answer = "";
		StringBuilder sb = new StringBuilder();

		int count = 1;
		for(int i=1; i<word.length(); i++) {
			if(word.charAt(i-1) == word.charAt(i)) {
				count ++;
			} else {
				sb.append(word.charAt(i-1));
				if(count > 1) {
					sb.append(count);
					count = 1;
				}
			}
		}
		
		if(count == 1) {
			sb.append(word.charAt(word.length()-1));
		}else {
			sb.append(word.charAt(word.length()-1));
			sb.append(count);
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

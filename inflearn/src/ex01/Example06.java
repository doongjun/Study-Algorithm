package ex01;

import java.util.HashSet;
import java.util.Scanner;

// 6.중복문자제거
public class Example06 {
	
	static String solution(String word) {
		String answer = "";
		HashSet<Character> charSet = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for(char c : word.toCharArray()) {
			if(charSet.contains(c)) continue;
			
			charSet.add(c);
			sb.append(c);
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

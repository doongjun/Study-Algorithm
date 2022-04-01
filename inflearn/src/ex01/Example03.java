package ex01;

import java.util.Scanner;

// 3.문장 속 단어
public class Example03 {
	
	static String solution(String line) {
		String answer = "";
		
		String[] words = line.split(" ");
		
		int maxLength = Integer.MIN_VALUE;
		for(String word : words) {
			if(word.length() > maxLength) {
				maxLength = word.length();
				answer = word;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		
		System.out.println(solution(line));
	}
}

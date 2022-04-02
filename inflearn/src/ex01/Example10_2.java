package ex01;

import java.util.Scanner;

// 10.가장 짧은 문자거리
public class Example10_2 {
	
	static int[] solution(String word, char target) {
		int[] answer = new int[word.length()];
		
		int p = 1000;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == target) {
				p = 0;
				answer[i] = p;
			} else {
				answer[i] = ++p;
			}
		}
		
		for(int i=word.length()-1; i>=0; i--) {
			if(word.charAt(i) == target) {
				p = 0;
			} else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		char target = scan.next().charAt(0);
		
		for(int i : solution(word, target)) {
			System.out.print(i + " ");
		}
	}
}

package ex01;

import java.util.Scanner;

// 10.가장 짧은 문자거리
public class Example10 {
	
	static String solution(String word, char target) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		
		int[] board = new int[word.length()];
		int p = 1000;
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(c == target) {
				p = 0;
				board[i] = p;
				
				continue;
			}
			board[i] = ++p;
		}
		
		for(int i=word.length()-1; i>=0; i--) {
			char c = word.charAt(i);
			if(c == target) {
				p = 0;
				continue;
			}
			
			p++;
			if(board[i] > p) {
				board[i] = p;
			}
		}
		
		for(int i=0; i<board.length; i++) {
			sb.append(board[i]).append(" ");
		}
		answer = sb.toString();

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		char target = scan.next().charAt(0);
		System.out.println(solution(word, target));
	}
}

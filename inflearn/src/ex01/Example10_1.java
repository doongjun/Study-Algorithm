package ex01;

import java.util.Scanner;

// 10.가장 짧은 문자거리
public class Example10_1 {
	
	static String solution(String word, char target) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		int[] board = new int[word.length()];
		
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(c == target) {
				for(int j=0; j<board.length; j++) {
					if(i==j) continue;
					if(word.charAt(j) == target) continue;
					
					int d = Math.abs(i-j);
					if(board[j] == 0 || board[j] > d) board[j] = d;
				}
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

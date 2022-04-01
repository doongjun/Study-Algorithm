package ex01;

import java.util.ArrayList;
import java.util.Scanner;

// 4.단어 뒤집기
public class Example04 {
	
	static ArrayList<String> solution(int n, String[] words) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String word : words) {
			String reverse = new StringBuilder(word).reverse().toString();
			answer.add(reverse);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] words = new String[n];
		for(int i=0; i<n; i++) {
			String word = scan.next();
			words[i] = word;
		}
		
		for(String result : solution(n, words)) {
			System.out.println(result);
		}
	}
}

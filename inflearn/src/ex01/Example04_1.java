package ex01;

import java.util.ArrayList;
import java.util.Scanner;

// 4.단어 뒤집기
public class Example04_1 {
	
	static ArrayList<String> solution(int n, String[] words) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String word : words) {
			char[] chars = word.toCharArray();
			
			int lt = 0, rt = word.length()-1;
			while (lt < rt) {
				char tmp = chars[lt];
				chars[lt] = chars[rt];
				chars[rt] = tmp;
				lt++;
				rt--;
			}
			
			String reverseWord = String.valueOf(chars);
			answer.add(reverseWord);
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

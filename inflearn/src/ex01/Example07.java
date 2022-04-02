package ex01;

import java.util.Scanner;

// 6.회문문자열
public class Example07 {
	
	static String solution(String word) {
		String answer = "YES";
		
		char[] chars = word.toUpperCase().toCharArray();
		
		int left = 0;
		int right = word.length()-1;
		while(left < right) {
			if(chars[left] != chars[right]) {
				answer = "NO";
				break;
			}
			left++;
			right--;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		System.out.println(solution(word));
	}
}

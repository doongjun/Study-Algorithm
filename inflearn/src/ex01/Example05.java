package ex01;

import java.util.Scanner;

// 5.특정 문자 뒤집기
public class Example05 {
	
	static String solution(String word) {
		String answer = "";
		
		char[] chars = word.toCharArray();
		int left = 0, right = word.length()-1;
		
		while(left < right) {
			if(!Character.isAlphabetic(chars[left])) left++;
			else if(!Character.isAlphabetic(chars[right])) right--; 
			else {
				char tmp = chars[left];
				chars[left] = chars[right];
				chars[right] = tmp;
				
				left++;
				right--;
			}
		}
		answer = String.valueOf(chars);
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		System.out.println(solution(word));
	}
}

package ex01;

import java.util.Scanner;

// 5.특정 문자 뒤집기
public class Example05_1 {
	
	static String solution(String word) {
		String answer = "";
		
		char[] chars = word.toCharArray();
		int left = 0, right = word.length()-1;
		
		while(left < right) {
			while(!(chars[left]>='a' && chars[left]<='z' || chars[left]>='A' && chars[left]<='Z')) {
				left++;
			}
			while(!(chars[right]>='a' && chars[right]<='z' || chars[right]>='A' && chars[right]<='Z')) {
				right--;
			}
			if(left > right) break;
			
			char tmp = chars[left];
			chars[left] = chars[right];
			chars[right] = tmp;
			
			left++;
			right--;
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

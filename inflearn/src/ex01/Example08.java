package ex01;

import java.util.Scanner;

// 8.유효한 팰린드롬
public class Example08 {
	
	static String solution(String line) {
		String answer = "YES";
		
		char[] chars = line.replaceAll(" ", "").toUpperCase().toCharArray();
		
		int left=0;
		int right=chars.length-1;
		while(left < right) {
			if(!Character.isAlphabetic(chars[left])) left++;
			else if(!Character.isAlphabetic(chars[right])) right--;
			else {
				if(chars[left] != chars[right]) return "NO";
				left++;
				right--;
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

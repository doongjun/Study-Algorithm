package ex01;

import java.util.Scanner;

// 9.숫자만 추출
public class Example09 {
	
	static int solution(String word) {
		int answer = 0;
		
		word = word.replaceAll("[A-Za-z]", "");
		answer = Integer.parseInt(word);

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		System.out.println(solution(word));
	}
}

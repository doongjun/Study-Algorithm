package ex01;

import java.util.Scanner;

// 9.숫자만 추출
public class Example09_1 {
	
	static int solution(String word) {
		int answer = 0;
		
		for(char c : word.toCharArray()) {
			if(c>=48 && c<57) {
				answer = answer*10 + (c-48);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		System.out.println(solution(word));
	}
}

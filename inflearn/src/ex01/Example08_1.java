package ex01;

import java.util.Scanner;

// 8.유효한 팰린드롬
public class Example08_1 {
	
	static String solution(String line) {
		String answer = "NO";
		
		line = line.toUpperCase().replaceAll("[^A-Z]", "");
		String rLine = new StringBuilder(line).reverse().toString();
		
		if(line.equals(rLine)) answer = "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		System.out.println(solution(line));
	}
}

package ex02;

import java.util.Scanner;

// 3.피보나치수열
public class Example03_1 {

	static int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i=2; i<n; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		for(int x : solution(n)) {
			System.out.println(x + " ");
		}
	}
}

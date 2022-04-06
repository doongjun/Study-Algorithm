package ex02;

import java.util.Scanner;

// 7.점수계산
public class Example08 {

	static int solution(int n, int[] arr) {
		int answer = 0, score = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) {
				score = 0;
			} else {
				score++;
				answer += score;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(n, arr));
	}
}

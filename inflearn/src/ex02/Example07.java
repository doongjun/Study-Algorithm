package ex02;

import java.util.Scanner;

// 8.등수구하기
public class Example07 {

	static int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i=0; i<n; i++) {
			answer[i] = 1;
			for(int j=0; j<n; j++) {
				if(arr[j] > arr[i]) {
					answer[i]++;
				}
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

		for(int i : solution(n, arr)) {
			System.out.print(i + " ");
		}
	}
}

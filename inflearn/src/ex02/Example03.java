package ex02;

import java.util.Scanner;

// 3.가위바위보
public class Example03 {
	
	static char[] solution(int n, int[] A, int[] B) {
		char[] answer = new char[n];
		
		for(int i=0; i<n; i++) {
			if(A[i] == B[i]) answer[i] = 'D';
			else if(A[i] == 1 && B[i] == 3) answer[i] = 'A';
			else if(A[i] == 2 && B[i] == 1) answer[i] = 'A';
			else if(A[i] == 3 && B[i] == 2) answer[i] = 'A';
			else answer[i] = 'B';
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = scan.nextInt();
		}
		for(int i=0; i<n; i++) {
			B[i] = scan.nextInt();
		}

		for(char winner : solution(n, A, B)) {
			System.out.println(winner);
		}
	}
}

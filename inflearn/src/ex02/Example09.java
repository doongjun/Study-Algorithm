package ex02;

import java.util.Scanner;

// 9.격자판 최대합
public class Example09 {

	static int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int vSum, hSum;
		for(int i=0; i<n; i++) {
			vSum = 0;
			hSum = 0;
			for(int j=0; j<n; j++) {
				vSum += arr[i][j];
				hSum += arr[j][i];
			}
			
			answer = Math.max(answer, vSum);
			answer = Math.max(answer, hSum);
		}
		
		int dSum1 =0, dSum2 = 0;
		for(int i=0; i<n; i++) {
			dSum1 += arr[i][i];
			dSum2 += arr[i][n-1-i];
		}
		
		answer = Math.max(answer, dSum1);
		answer = Math.max(answer, dSum2);
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println(solution(n, arr));
	}
}

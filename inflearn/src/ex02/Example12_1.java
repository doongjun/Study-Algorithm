package ex02;

import java.util.Scanner;

// 12.멘토링
public class Example12_1 {

	static int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int cnt = 0;
				for(int k=0; k<m; k++) {
					int pi=0, pj=0;
					for(int s=0; s<n; s++) {
						if(arr[k][s] == i) pi = s;
						if(arr[k][s] == j) pj = s;
					}
					if(pi < pj) cnt++;
				}
				if(cnt == m) answer ++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println(solution(n, m, arr));
	}
}

package ex02;

import java.util.Scanner;

// 10.봉우리
public class Example10 {

	static int solution(int n, int[][] arr) {
		int answer = 0;
		int[][] d = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean isPeak = true;
				for(int k=0; k<4; k++) {
					int dx = i + d[k][0];
					int dy = j + d[k][1];
					if(dx < 0 || dx >=n || dy < 0 || dy >= n) continue;
					
					if(arr[i][j] <= arr[dx][dy]) {
						isPeak = false;
						break;
					}
				}
				
				if(isPeak) answer ++;
			}
		}
		
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

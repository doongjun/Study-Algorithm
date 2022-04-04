package ex02;

import java.util.Scanner;

// 5.소수(에라토스테네스 체)
public class Example05 {

	static int solution(int n) {
		int answer = 0;

		boolean[] d = new boolean[n+1];
		
		for(int i=2; i<=n; i++) {
			if(!d[i]) {
				answer++;
				for(int j=i; j<=n; j=j+i) {
					d[j] = true;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		System.out.println(solution(n));
	}
}

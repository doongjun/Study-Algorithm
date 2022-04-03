package ex02;

import java.util.Scanner;

// 3.피보나치수열
public class Example03 {

	static String solution(int n) {
		String answer = "";
		int[] result = new int[n+1];
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=n; i++) {
			if(i==1 || i==2) {
				sb.append("1 ");
				result[i] = 1;
			}
			else {
				result[i] = result[i-1] + result[i-2];
				sb.append(result[i] + " ");
			}
		}
		
		answer = sb.toString();
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		System.out.println(solution(n));
	}
}

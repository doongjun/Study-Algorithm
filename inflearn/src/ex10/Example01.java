package ex10;

import java.util.Scanner;

// 1.계단오르기(DP)
public class Example01 {
	public static int solution(int n) {
		int[] dy = new int[n];
		dy[0]=1;
		dy[1]=2;
		
		for(int i=2; i<n; i++) {
			dy[i] = dy[i-1]+dy[i-2];
		}
		
		return dy[n-1];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println(solution(n));
	}
}

package ex07;

import java.util.Scanner;

// 재귀함수
public class Example01_1 {
	
	public static void dfs(int n) {
		if(n==0) return;
		else {
			dfs(n-1);
			System.out.print(n + " ");
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		dfs(n);
	}

}

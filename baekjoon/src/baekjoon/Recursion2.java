package baekjoon;

import java.util.Scanner;

//10870
//피보나치 수 5
public class Recursion2 {
	public static int fibonacci(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fibonacci(n));
	}
}

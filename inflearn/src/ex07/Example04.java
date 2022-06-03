package ex07;

import java.util.Scanner;

// 피보나치수열(재귀)
public class Example04 {
	static int[] fibo;
	public static int fibonacci(int n) {
		if(fibo[n]>0) return fibo[n];
		
		if(n==1 || n==2) return fibo[n]=1;
		return fibo[n] = fibonacci(n-2) + fibonacci(n-1);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		fibo = new int[n+1];
		
		fibonacci(n);
		for(int i=1; i<=n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}

}

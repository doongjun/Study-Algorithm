package ex02;

import java.util.Scanner;

// 4.피보나치수열
public class Example04_2 {

	static void solution(int n) {
		int a=1, b=1, c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++) {
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		solution(n);
	}
}

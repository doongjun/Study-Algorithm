package baekjoon;

import java.util.Scanner;

//10872
//팩토리얼
public class Recursion1 {
	public static int factorial(int n) {
		if(n<=1) return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));
	}

}

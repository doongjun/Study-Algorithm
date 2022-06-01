package ex07;

import java.util.Scanner;

// 재귀함수
public class Example01 {
	
	public static void recursiveFunc(int n) {
		if(n>1) recursiveFunc(n-1);
		System.out.print(n + " ");
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		recursiveFunc(n);
	}

}

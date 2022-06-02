package ex07;

import java.util.Scanner;

// 이진수 출력(재귀)
public class Example02 {
	
	public static void recursiveFunc(int n) {
		if(n==0) return;
		recursiveFunc(n/2);
		System.out.print(n%2);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		recursiveFunc(n);
	}

}

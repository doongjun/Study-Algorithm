package ex08;

import java.util.Scanner;

// 7.조합의 경우수(메모이제이션)
public class Example07 {
	static int[][] mem;
	
	public static int recursion(int n, int r) {
		if(mem[n][r] != 0) return mem[n][r];
		else {
			if(r==0 || n==r) {
				return mem[n][r] = 1;
			} else {
				return mem[n][r] = recursion(n-1, r-1) + recursion(n-1, r);
			}
		}
	}
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int r = scan.nextInt();
        mem = new int[n+1][r+1];
        
        System.out.println(recursion(n, r));
    }
}

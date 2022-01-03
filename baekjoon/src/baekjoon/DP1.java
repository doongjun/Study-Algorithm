package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2748 피보나치 수 2
public class DP1 {
	public static Long[] rcrd;
	
	public static long fibo(int n) {
		if(rcrd[n] == null) {
			rcrd[n] = fibo(n-1) + fibo(n-2);
		}
		return rcrd[n];
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		rcrd = new Long[n + 1];
		rcrd[0] = 0L;
		rcrd[1] = 1L;
		
		System.out.println(fibo(n));
	}
}

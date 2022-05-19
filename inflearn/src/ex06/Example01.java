package ex06;

import java.util.Scanner;
import java.util.Stack;

// 1.선택정렬
public class Example01 {
	static int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			int min = arr[i];
			int minIdx = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIdx = j;
				}
			}
			if(minIdx == i) continue;
			
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int x : solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}

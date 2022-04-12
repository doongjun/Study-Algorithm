package ex03;

import java.util.ArrayList;
import java.util.Scanner;

// two pointers algorithm
// 1.두 배열 합치기
public class Example01_1 {

	static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(arr1[p1]<arr2[p2]) answer.add(arr1[p1++]);
			else answer.add(arr2[p2++]);
		}
		while(p1<n) answer.add(arr1[p1++]);
		while(p2<m) answer.add(arr2[p2++]);
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = scan.nextInt();
		}
		
		for(int i : solution(n, arr1, m, arr2)) {
			System.out.print(i + " ");
		}
	}
}

package ex03;

import java.util.ArrayList;
import java.util.Scanner;

// two pointers algorithm
// 1.두 배열 합치기
public class Example01 {

	static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		while(true) {
			if(i >= n) {
				for(int k=j; k<m; k++) {
					answer.add(arr2[k]);
				}
				break;
			}
			if(j >= m) {
				for(int k=i; k<n; k++) {
					answer.add(arr1[k]);
				}
				break;
			}
			
			if(arr1[i] > arr2[j]) {
				answer.add(arr2[j]);
				j++;
			} else {
				answer.add(arr1[i]);
				i++;
			}
		}
		
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

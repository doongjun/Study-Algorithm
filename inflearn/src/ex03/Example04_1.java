package ex03;

import java.util.Scanner;

// two pointers algorithm
// 4.연속 부분수열
public class Example04_1 {

	static int solution(int n, int m, int[] arr) {
		int answer=0, sum=arr[0];
		
		int lt=0, rt=1;
		while(rt < n || sum >= m) {
			if(sum < m) {
				sum += arr[rt++];
			} else if(sum == m) {
				sum -= arr[lt++];
				answer++;
			} else {
				sum -= arr[lt++];
			}				
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(n, m, arr));
	}
}

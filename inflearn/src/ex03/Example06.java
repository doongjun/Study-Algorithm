package ex03;

import java.util.Scanner;

// 6.최대 길이 연속부분수열
public class Example06 {

	static int solution(int n, int k, int[] arr) {
		int answer=0, cnt=0, lt=0;
		
		for(int rt=0; rt<n; rt++) {
			if(arr[rt]==0) cnt++;
			
			while(cnt>k) {
				if(arr[lt]==0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(n, k, arr));
	}
}

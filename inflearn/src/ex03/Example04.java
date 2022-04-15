package ex03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// queue
// 4.연속 부분수열
public class Example04 {

	static int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0;;
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			sum += arr[i];
			q.add(i);	
			if(sum == m) answer++;
			while(sum >= m) {
				sum -= arr[q.poll()];
				if(sum == m) answer++;
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

package ex05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// queue
// 6.공주 구하기
public class Example06 {
	static int solution(int n, int k) {
		int answer =0;
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		
		int cnt = 1;
		while(queue.size() > 1) {
			if(cnt < k) {
				queue.offer(queue.poll());
				cnt++;
			} else {
				queue.poll();
				cnt = 1;
			}
		}
		
		answer = queue.peek();
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		System.out.println(solution(n, k));
	}
}

package ex05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// queue
// 6.공주 구하기
public class Example06_1 {
	static int solution(int n, int k) {
		int answer =0;
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		
		while(!queue.isEmpty()) {
			for(int i=1; i<k; i++) {
				queue.offer(queue.poll());
			}
			queue.poll();
			if(queue.size()==1) return queue.poll();
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		System.out.println(solution(n, k));
	}
}

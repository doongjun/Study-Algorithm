package ex07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지찾기(BFS)
public class Example08 {
	public static int bfs(int root, int target) {
		int[] dis = {-1, 1, 5};
		boolean[] check = new boolean[10001];
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(root);
		check[root] = true;
		
		int level = 0;
		while(!queue.isEmpty()) {
			int len = queue.size();
			for(int i=0; i<len; i++) {
				int cur = queue.poll();
//				if(cur == target) return level;
				for(int d : dis) {
					int next = cur+d;
					if(next==target) return level+1;
					if(next>=1 && next<=10000 && !check[next]) {
						queue.offer(next);
						check[next] = true;
					}
				}
			}
			level++;
		}
		
		return -1;
	}
	
	public static int solution(int S, int E) {
		int answer = bfs(S, E);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int S = scan.nextInt();
		int E = scan.nextInt();
		
		System.out.println(solution(S, E));
	}
}

